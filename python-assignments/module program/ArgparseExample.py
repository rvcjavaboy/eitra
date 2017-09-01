
import argparse
parser = argparse.ArgumentParser()
parser.parse_args()
"""
python program.py --help (or python program.py -h) 
usage: program.py [-h]

optional arguments:
  -h, --help  show this help message and exit"""

parser.add_argument("echo") 	# naming it "echo"
args = parser.parse_args()	# returns data from the options specified (echo)
print(args.echo)

"""$ python program.py

usage: program.py [-h] echo
program.py: error: too few arguments"""