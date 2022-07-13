import sys


def same_content(file1, file2) -> bool:
    # Complete this method!
    f1 = open(file1, "r").read()
    f2 = open(file2, "r").read()
    
    if len(f1) == len(f2):
        for i in f1: 
            if i not in f2:
                return False
    else: 
        return False

    return True


if __name__ == "__main__":
    if same_content(sys.argv[1], sys.argv[2]):
        print("The two files have the same content.")
    else:
        print("The two files do not have the same content.")
