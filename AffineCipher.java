/*Author Name - Tushar Vidhani
 * Registration No. - 2241022011
 * Section - 32
 */
import java.util.Scanner;
public class AffineCipher
{
	
	public static String encrypt(String plaintext)
	{
		int k1=7,k2=2;
		String C="";
		for(int i=0;i<plaintext.length();i++)
		{
			int P=plaintext.charAt(i);
			P=P-'a';
			C=C+(char)((P*k1+k2)%26+'A');
		}
		return C;
	}
	
	public static String decrypt(String ciphertext)
	{
		int k1=7,k2=2,k1_inverse=0;
		String P="";
		for(int j=1;j<26;j++)
		{
			if(k1*j%26==1)
			{
				k1_inverse=j;
				break;
			}
		}

		for(int i=0;i<ciphertext.length();i++)
		{
			int C=ciphertext.charAt(i);
			C=C-'A';
			if (C-k2<0)
				while(true)
				{
					C=C+26;
					if (C>=0)
						break;
				}
			P=P+(char)((C-k2)*k1_inverse%26+'a');
		}
		return P;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the plaintext: ");
		String plaintext=sc.next();
		String C=encrypt(plaintext);
		System.out.println("Ciphertext: "+C);
		System.out.println("Decrypted text: "+decrypt(C));

	}

}
