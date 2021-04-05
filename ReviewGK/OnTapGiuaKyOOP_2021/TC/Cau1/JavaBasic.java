public class JavaBasic{
    public static int sumNegativeElements(int a[]){
        //sinh vien code tai day
        int result = 0;
        for(int value: a){
            if (value < 0){
                result += value;
            }
        }
        return result;
    }

    public static String uppercaseFirstVowels(String str){
        //sinh vien code tai day
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i) == 'u' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'a' || str.charAt(i) == 'i') && (i == 0 || str.charAt(i) == ' ')){
                result = result + Character.toUpperCase(str.charAt(i));
            }
            else{
                result = result + str.charAt(i);
            }
        }

        return result;
    }
	
	public static int findMinNegativeElement(int a[]){
        //sinh vien code tai day
        int min = 0;
        for(int i = 1; i < a.length; i++){
            if (a[min] > a[i]){
                min = i;
            }
        }

        if(a[min] < 0){
            return min;
        }

        return -1;
    }
	
	public static String getName(String str){
        //sinh vien code tai day
        int doubleDot = str.indexOf(':');

        return str.substring(doubleDot+2);
    }

    public static int findFirstMod3Element(int[] a){
        //sinh vien code tai daye
        for(int i = 0; i < a.length; i++){
            if(a[i] % 3 == 0){
                return i;
            }
        }
        return -1;
    }

    public static int countString(String str, String k){
        //sinh vien code tai day
        int countWord = 0;
        String[] nameWords = str.toLowerCase().split(" ");
        for (String word : nameWords){
            System.out.println(word + k.toLowerCase());
            if (word.equals(k.toLowerCase())){
                countWord ++;
            }
        }
        return countWord;
    }

    public static void main(String[] args){
        int[] a = {1,-2,3,4,-2,1,-9};
        //sinh vien code tai day
        System.out.println(countString(s2, "Anh"));
        String s = "nguyen thi uyen an";
        //sinh vien code tai day
		String s1 = "Ho ten: Nguyen Thi Anh Dao";
		//sinh vien code tai day
        String s2 = "Nguyen Phuong Hoang Anh Phuong Oanh";
		//sinh vien code tai day
        // System.out.println(countString(s2, "Anh"));
    }

}