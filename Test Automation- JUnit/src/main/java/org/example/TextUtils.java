package org.example;

//Omnia Osama Ahmed - 1084505
//Sara Imad Hamdan - 1087070

public class TextUtils
{

    public static int countVowels(String s) {
        if (s == null) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static String removePunctuation(String s)
    {
        if (s == null)
        {
            return null;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //Defining common punctuation marks manually
            boolean isPunctuation = false;

            if (ch == '.' || ch == ',' || ch == '?' || ch == '!' || ch == ';' || ch == ':' ||
                    ch == '"' || ch == '\'' || ch == '-' || ch == '(' || ch == ')' ||
                    ch == '[' || ch == ']' || ch == '{' || ch == '}' || ch == '/' ||
                    ch == '\\' || ch == '#' || ch == '@' || ch == '$' || ch == '%' ||
                    ch == '^' || ch == '&' || ch == '*' || ch == '_' || ch == '~' || ch == '`' ||
                    ch == '<' || ch == '>')
            {

                isPunctuation = true;
            }

            if (!isPunctuation)
            {
                result.append(ch);
            }
        }

        return result.toString();
    }


    public static boolean isPalindrome(String s)
    {
        if (s == null)
        {
            return false;
        }

        //building a lowercase version without spaces
        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            //Skip spaces
            if (ch != ' ')
            {
                //Converting uppercase to lowercase manually
                if (ch >= 'A' && ch <= 'Z')
                {
                    ch = (char) (ch + 32);
                }
                cleaned.append(ch);
            }
        }

        // Compare characters from both ends
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
