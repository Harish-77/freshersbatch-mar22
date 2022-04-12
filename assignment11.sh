read -p "Guess the secret number between 1&5: " number
if [[ $number -eq 2 ]]
then
	echo "Good! you have given a correct guess.$number"
fi
echo "guessed"
