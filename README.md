Description of Affine Cipher Program


What is Affine cipher?


The Affine cipher is a type of monoalphabetic substitution cipher, wherein each letter in an alphabet is mapped to its numeric equivalent, encrypted using a simple mathematical function, and converted back to a letter. The formula used means that each letter encrypts to one other letter, and back again, meaning the cipher is essentially a standard substitution cipher with a rule governing which letter goes to which. The function used is an affine transformation, which involves multiplication and addition operations on the characters of the plaintext. The encryption and decryption keys consist of two numbers, which determine the specific affine transformation used. The security of the Affine Cipher is relatively weak and can be easily broken with simple frequency analysis.


How the code works?


The program takes user input as plaintext and uses a combination of a multiplicative key (k1) and an additive key (k2) to encrypt the plaintext.


The encrypt method takes plaintext as argument of String data type, encrypts it and returns the ciphertext. For loop is used to fetch all the characters(and their corresponding ASCII values) from the String(plaintext). We have subtracted ‘a’(97) from their ASCII values in order to get the values in range of 0 to 25 for further calculation. Each character is then converted to their corresponding ciphertext character using the encryption algorithm C = (P*k1 + k2) mod 26 and ‘A’(65) is added to it in order to get back the values in range of A to Z before adding it to the empty String C. The encrypted text i.e., the ciphertext is then returned to the main method and is stored in variable C for further decryption.


The decrypt method takes ciphertext(C) as argument, decrypts it and returns the plaintext. First the for loop is used to calculate the inverse of k1(mod 26) and store in the variable k1_inverse and then the another for loop is used to fetch all characters from ciphertext and subtracted with ‘A’(65) to get the value in the range of 0 to 25. Each character is then converted to their corresponding plaintext character using the decryption algorithm P=(C-k2)*k1_inverse%26 and ‘a’(97) is added to it in order to get back the values in range of a to z before adding it to the empty String P.
When (C-k2) is negative, we get value of P negative as the program gives -ve remainder when % is used. Therefore, to get the remainder positive when (C-k2) is negative, C value is incremented by 26 until it becomes positive or equal to 0 and then the value of P is calculated. The decrypted text is then returned to the main method and printed using println() method.


Output:-


Enter the plaintext: hello
Ciphertext: ZEBBW
Decrypted text: hello