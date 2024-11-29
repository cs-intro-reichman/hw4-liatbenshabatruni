

public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [] arr = new boolean[n+1];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        int index = 3;
        int p = 2;
        while (p < Math.sqrt(arr.length)){
            while (index < arr.length){
                if (index%p==0){
                    arr[index]=false;
                }
                //System.out.println(index + "=" + arr[index]);
                index++;
            }
            p++; //4
            //System.out.println(arr[p]+ " "+ p);
            while (p < Math.sqrt(arr.length)){
                if (arr[p]==true){
                //System.out.println(arr[p]+ " "+ p);
                    break;
                }
                else {
                    p++;
                }
            }
        index=p+1;
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==true){
            System.out.println(i);
            counter++;
            }
            
        }
        System.out.println("There are "+ counter+" primes between 2 and "+n+ " (" + ((100*counter)/n) +"% are primes)");
    }
}

