class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String[] arriveA=arriveAlice.split("-");
        String[] leaveA=leaveAlice.split("-");
        String[] arriveB=arriveBob.split("-");
        String[] leaveB=leaveBob.split("-");
        int[] startDate = new int[2];
        int[] endDate = new int[2];

        

        if(Integer.parseInt(arriveA[0])<Integer.parseInt(arriveB[0])){
            startDate[0]=Integer.parseInt(arriveB[0]);
            startDate[1]=Integer.parseInt(arriveB[1]);
        }else if(Integer.parseInt(arriveA[0])==Integer.parseInt(arriveB[0]) && Integer.parseInt(arriveA[1])<Integer.parseInt(arriveB[1])){
            startDate[0]=Integer.parseInt(arriveB[0]);
            startDate[1]=Integer.parseInt(arriveB[1]);
        }else{
            startDate[0]=Integer.parseInt(arriveA[0]);
            startDate[1]=Integer.parseInt(arriveA[1]);
        }

        if(Integer.parseInt(leaveA[0])>Integer.parseInt(leaveB[0])){
            endDate[0]=Integer.parseInt(leaveB[0]);
            endDate[1]=Integer.parseInt(leaveB[1]);
        }else if(Integer.parseInt(leaveA[0])==Integer.parseInt(leaveB[0]) && Integer.parseInt(leaveA[1])>Integer.parseInt(leaveB[1])){
            endDate[0]=Integer.parseInt(leaveB[0]);
            endDate[1]=Integer.parseInt(leaveB[1]);
        }else{
            endDate[0]=Integer.parseInt(leaveA[0]);
            endDate[1]=Integer.parseInt(leaveA[1]);
        }

        if(startDate[0]>endDate[0]){
            return 0;
        }else if(startDate[0]==endDate[0] && startDate[1]>endDate[1]){
            return 0;
        }

        if(startDate[0]==endDate[0]){
            return endDate[1]-startDate[1]+1;
        }
        int[] dayCount=new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days=0;
        days+=dayCount[startDate[0]-1]-startDate[1];
        days+=1;
        for(int d=0;d<endDate[1];d++){
            days++;
        }
        for(int m=startDate[0]+1;m<endDate[0];m++){
            days+=dayCount[m-1];
        }
        return days;
    }
}