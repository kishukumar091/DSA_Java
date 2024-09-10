import java.util.ArrayList;

public class ContainerWithMostWater {

    //brute force Approach -- O(N^2)
    public static int StoreWater(ArrayList<Integer> heigth){
        int maxWater=0;
        for (int i = 0; i < heigth.size() ; i++) {
            for (int j = i+1; j < heigth.size(); j++) {
                int ht=Math.min(heigth.get(i), heigth.get(j));
                int width=j-i;
                int currWater=ht*width;
                maxWater=Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }


    //2 Pointer Approach O(N)
    public static int storeWater(ArrayList<Integer>height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while (lp<rp){
            //calculate water Area
            int ht=Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(maxWater,currWater);

            //Update Pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else {
                rp--;
            }

        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> heigth=new ArrayList<>();
        heigth.add(1);
        heigth.add(8);
        heigth.add(6);
        heigth.add(2);
        heigth.add(5);
        heigth.add(4);
        heigth.add(8);
        heigth.add(3);
        heigth.add(7);
        System.out.println(StoreWater(heigth));
        System.out.println(storeWater(heigth));
    }
}
