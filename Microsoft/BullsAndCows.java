class Solution {
    public String getHint(String secret, String guess) {

        int[] s  = new int[10];
        int[] g = new int[10];
        int bulls = 0,cows = 0;


        for(int i = 0;i<guess.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i)) {
                bulls++;

            }
            else{
                s[secret.charAt(i)-'0']++;
                g[guess.charAt(i)-'0']++;
            }
        }
        for(int i = 0;i<10;i++)
        {
            cows+=Math.min(s[i],g[i]);
        }
        // System.out.println(secret);
        return new StringBuilder().append(bulls).append("A").append(cows).append("B").toString();
    }
}