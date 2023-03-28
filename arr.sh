#!/bin/bash
read n
sum=0
echo "enter no."
for (( i=0; $i < $n; i++ ))
do
        read line
        #my_array=("${my_array[@]}" $line)
        sum=`expr $line + $sum`
done
avg=`expr $sum / $n`
echo $avg
