num1=1
num(){
	n1=2
	echo $n1
	n2=3
	echo $n2
echo "after invoking function"
}
num
echo $num1 "this is global variable"
