import sys


def contains(filename, test_word) -> bool:
    # complete this method!
    # test_word.trim
    # print(test_word)x
    with open(filename, 'r') as f: 
        for i in f: 
            if test_word in i:
                return True

    return False


if __name__ == "__main__":
    if contains(sys.argv[1], sys.argv[2]):
        print("The file contains the word.")
    else:
        print("The file does not contain the word.")
