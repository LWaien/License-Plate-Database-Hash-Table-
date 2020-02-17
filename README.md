# License-Plate-Database-Hash-Table-
Hash table that uses license plate codes as a hashing function to store user names


This is a hypothetical hash table that is not the most practical but displays a comprehension of the data structure. The hashing function works likes this: 

//hypothetical plate = "abc123" corresponds to index of each letter and digit in the array  ie. ("a"+"b"+"c") + (1+2+3) = Index --> (0+1+2) + (1+2+3) = 9 ----> Array[9]
//hypothetical plate then corresponds to following fake vehicle owners.

The license class generates an array with a size that corresponds to the total amount of all possible license combinations assuming that there are no repeated characters. It does this by replicating factorials which are then multiplied to account for both letters and digits.
( (26 factorial/26-number of letters factorial) * (10 factorial/ 10 - number of digits factorial) )
