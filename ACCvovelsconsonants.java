//  Problem Statement //
/*You need to implement a function to calculate the difficulty index of a given sentence based on specific rules for classifying words as "Hard" or "Easy".

Definitions:
Alphabet Classification:

The English alphabet consists of 26 letters.
5 letters are vowels: a, e, i, o, u.
The remaining 21 letters are consonants.


Function Prototype:
int difficulty(char str[], int len);
    str: An array of characters representing the input sentence.
    len: An integer representing the length of the input sentence.

Word Classification Rules:
A word is classified as "Hard" if:
It contains more consonants than vowels, or
It contains three consecutive consonants.
Otherwise, the word is classified as "Easy".
Input:

The input string (str) contains space-separated words, such as:
"I may like chocolate"
"how is the weather tonight"
Difficulty Index Calculation:

Each "Hard" word contributes +5 to the difficulty index.
Each "Easy" word contributes -2 to the difficulty index.
The difficulty index is calculated as:
Difficulty Index=(5×number of hard words)−(2×number of easy words)

Output:

The function returns the calculated difficulty index as an integer.

*/


public class ACCvovelsconsonants {
    public static int Difficulty(char str[],int len){
        int c=0; //
        int v=0;
        int hard=0;
        int easy=0;
        boolean iscontinous= false; // $ its b 
        int a=0; // to keep track the number of consonants
        int difficultindex=0;

        for(int i=0;i<len;i++){
        if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||
           str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U'){
            v++;
            a=0;
           }else if(str[i]!=' '){
            c++;
            a++;

            if(a==3){
                iscontinous=true;
            }
        }
            if(str[i]==' '||i==len-1){
                if (iscontinous|| c>v){
                    hard++;
                }else {
                    easy++;
                }
                c = 0;
                v = 0;
                iscontinous = false;
                a = 0;
            }
        }
        System.out.println(hard);
        System.out.println(easy);
        difficultindex=(5*hard)-(2*easy);

        return difficultindex;
    }

    

    public static void main(String [] args){
        String input = "qlewldoaa life ace by fantasy";
        char str[] = input.toCharArray();
        int len=input.length();
        int result = Difficulty(str, len);
        System.out.println("the difficulty indexis: "+result);
        
    }
}
