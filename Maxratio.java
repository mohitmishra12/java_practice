import java.util.PriorityQueue;

class Maxratio {
    private class Info implements Comparable<Info> {
        double pass, total, pr;
        Info(double p, double i){
            pass = p;
            total = i;
            pr = (p+1)/(i+1) - (p)/(i);
        }

        @Override
        public int compareTo(Info p1){
            if(this.pr > p1.pr){
                return -1;
            }else if(this.pr < p1.pr){
                return 1;
            }
            return 0;
        }
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Info> pq = new PriorityQueue<>();

        for(int i=0; i<classes.length; i++){
            pq.add(new Info(classes[i][0], classes[i][1]));
        }

        while(extraStudents-- > 0){
            Info curr = pq.remove();
            pq.add(new Info(curr.pass + 1, curr.total+1));
        }

        int size = pq.size();
        double res = 0;
        while(!pq.isEmpty()){
            Info curr = pq.remove();
            res += (curr.pass/curr.total);
        }
        return res/size;
    }
}