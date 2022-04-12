read -p "please enter ur name: " name
read -p "please enter ur age: " age
read -p "your entered age is : $age if yes press y?" yes
if [[ $yes == y ]]
then
echo "$(($age*365))days"
else
echo "please enter ur correct age...."
fi
