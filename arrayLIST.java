import java.util.ArrayList;

public class arrayLIST {
    public static void main(String[] args) {
        //multi dimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(21);
        list1.add(51);
        list1.add(81);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(18);
        list2.add(12);
        list2.add(18);
        ArrayList<Integer>list3=new ArrayList<>();
        list3.add(81);
        list3.add(11);
        list3.add(10);
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer>currList=mainList.get(i);
            for (int j = 0; j <currList.size() ; j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
