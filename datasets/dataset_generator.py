import random
import sys

def generate_random_integers(number, min, max, out=None):
    if out is None:
        out = sys.stdout

    while number > 0:
        out.write(str(random.randint(min, max))+"\n")
	number -= 1
        

if __name__ == '__main__':
    try:
        size = int(sys.argv[1])
    except (ValueError, IndexError):
        size = 100

    try:
        lower_bound = int(sys.argv[2])
    except (ValueError, IndexError):
        lower_bound = -100

    try:
        upper_bound = int(sys.argv[3])
    except (ValueError, IndexError):
        upper_bound = 100

    generate_random_integers(size, lower_bound, upper_bound, sys.stdout)    
