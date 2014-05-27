def getTerminalSize():
    """This function decides what method to call to get the screen size.
    src: http://stackoverflow.com/questions/566746/how-to-get-console-window-width-in-python"""
    import platform
    current_os = platform.system()
    tuple_xy=None
    if current_os == 'Windows':
        tuple_xy = _getTerminalSize_windows()
        if tuple_xy is None:
            tuple_xy = _getTerminalSize_tput()
    if current_os == 'Linux' or current_os == 'Darwin' or  current_os.startswith('CYGWIN'):
        tuple_xy = _getTerminalSize_linux()
    if tuple_xy is None:
        tuple_xy = (80, 25)      # default value
    return tuple_xy

def _getTerminalSize_windows():
    """Get Windows terminal size"""
    res=None
    try:
        from ctypes import windll, create_string_buffer

        # stdin handle is -10
        # stdout handle is -11
        # stderr handle is -12

        h = windll.kernel32.GetStdHandle(-12)
        csbi = create_string_buffer(22)
        res = windll.kernel32.GetConsoleScreenBufferInfo(h, csbi)
    except:
        return None
    if res:
        import struct
        (bufx, bufy, curx, cury, wattr,
         left, top, right, bottom, maxx, maxy) = struct.unpack("hhhhHhhhhhh", csbi.raw)
        sizex = right - left + 1
        sizey = bottom - top + 1
        return sizex, sizey
    else:
        return None

def _getTerminalSize_tput():
    """Backup method for Windows
    src: http://stackoverflow.com/questions/263890/how-do-i-find-the-width-height-of-a-terminal-window"""
    try:
       import subprocess
       proc=subprocess.Popen(["tput", "cols"],stdin=subprocess.PIPE,stdout=subprocess.PIPE)
       output=proc.communicate(input=None)
       cols=int(output[0])
       proc=subprocess.Popen(["tput", "lines"],stdin=subprocess.PIPE,stdout=subprocess.PIPE)
       output=proc.communicate(input=None)
       rows=int(output[0])
       return (cols,rows)
    except:
        return None

def _getTerminalSize_linux():
    """Terminal size detection for Linux"""
    def ioctl_GWINSZ(fd):
        try:
            import fcntl, termios, struct, os
            cr = struct.unpack('hh', fcntl.ioctl(fd, termios.TIOCGWINSZ,'1234'))
        except:
            return None
        return cr
    cr = ioctl_GWINSZ(0) or ioctl_GWINSZ(1) or ioctl_GWINSZ(2)
    if not cr:
        try:
            fd = os.open(os.ctermid(), os.O_RDONLY)
            cr = ioctl_GWINSZ(fd)
            os.close(fd)
        except:
            pass
    if not cr:
        try:
            cr = (env['LINES'], env['COLUMNS'])
        except:
            return None
    return int(cr[1]), int(cr[0])

def clear():
    """Python has no good way of doing this, so fuck it, have some sketti code"""
    w,h = getTerminalSize()
    print("\n"*(2*h))

def title_screen():
    """This is the first screen that pops up
    S/O to the rest of the Coding Club for refusing to work on this"""
    logo = """
     ____                    __        __             
    |  _ \ _ __ _   _  __ _  \ \      / /_ _ _ __ ___ 
    | | | | '__| | | |/ _` |  \ \ /\ / / _` | '__/ __|
    | |_| | |  | |_| | (_| |   \ V  V / (_| | |  \__ \\
    |____/|_|   \__,_|\__, |    \_/\_/ \__,_|_|  |___/
                      |___/                           
                      """
    creds = """
    From the Sleepy Hollow High School Coding Club!
    Presidents: Colin Atkinson, Katie Brennan
    Advisor: Daniel Larkin
    https://github.com/colatkinson/drugwars"""
    clear()
    w,h = getTerminalSize()
    count = logo.count("\n") + creds.count("\n")
    print(logo)
    print(creds)
    print("\n"*(h-count-6))
    input("Press enter to continue...")
