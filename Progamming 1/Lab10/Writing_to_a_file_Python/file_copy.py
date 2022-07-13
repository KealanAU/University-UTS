import sys


def copy(from_filename, to_filename):
    # complete this method
    with open(from_filename,'r') as firstfile, open(to_filename,'w') as secondfile:
        for line in firstfile:
            if("done" in line):
                break
            else:
                secondfile.write(line)

    

    # pass


if __name__ == "__main__":
    copy(sys.argv[1], sys.argv[2])
