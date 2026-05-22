import java.util.*;
public class TaskH {
    static class Train{
        String name;
        int time;
        String destination;
        int index;
        String time2;
        Train(String nm,int tm,String dst,int idx,String time2){
            this.name=nm;
            this.time=tm;
            this.index=idx;
            this.destination=dst;
            this.time2=time2;
        }
    }
    public static int lexico(char c){
       int ascii=(int)c;
       if(ascii>=97&&ascii<=122)
           return ascii-97;
       else
           return (ascii-65)+26;
    }
    public static int uniqCompareNames(String t1, String t2){
        int minLen=Math.min(t1.length(),t2.length());

        for (int i = 0; i < minLen; i++) {
            if(t1.charAt(i)!=t2.charAt(i))
                return lexico(t1.charAt(i))-lexico(t2.charAt(i));
        }
    return t1.length()-t2.length();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Train trainList[]=new Train[T];
        for (int i = 0; i < T; i++) {
        String nm1=sc.next();
        sc.next();
        sc.next();
        sc.next();
        String dest=sc.next();
        sc.next();
        String time=sc.next();

        String timeSplit[]=time.split(":");
        int mins=Integer.parseInt(timeSplit[0])*60+Integer.parseInt(timeSplit[1]);

        trainList[i]=new Train(nm1,mins,dest,i,time);
        }
        Arrays.sort(trainList, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
               int compareNames=uniqCompareNames(o1.name, o2.name);
               if(compareNames!=0)
                   return compareNames;
               if(o1.time!=o2.time)
                   return o2.time-o1.time;
               return o1.index- o2.index;
            }
        });
        for (int i = 0; i < T; i++) {
            System.out.println(trainList[i].name+ " will depart for "+trainList[i].destination+" at "+trainList[i].time2);
        }
    }
}
