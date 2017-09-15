#!/bin/sh 


# Add this file to your home directory then include it in ~/.profile using `. ~/.profile-emoji-me.sh`

# These will show up in an emoji compatible terminal
ME_EMOJI=(🐶 🐱 🐭 🐹 🐰 🦊 🐻 🐼 🐨 🐯 🦁 🐮 🐷 🐸 🐵 🐙);
RANDOM_ME_EMOJI=${ME_EMOJI[$((RANDOM%14))]};
export PS1="\h:\W \u $RANDOM_ME_EMOJI  ";
export PROMPT_COMMAND='update_terminal_cwd; echo -ne "\033]0;${RANDOM_ME_EMOJI##*/}\007"';

# Default file is src/DemoRunner.java
if [ $# -ge 1 ]  
then
    code=$1
else
    code="DemoRunner"
fi

# Check of file exists inside src
if [ ! -f src/"$code.java" ]
then
    echo "File not found!"
    exit
fi

echo "\n🐶  Building file $code.java...."
cd src 
javac "$code.java" -d ../build

echo "\n🐶  Building complete."
cd ../build
ls 

echo "\n🐰  Running $code....\n"
echo "🐼  Output:"
java $code
