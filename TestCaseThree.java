import java.util.ArrayList;
import java.util.List;

public class TestCaseThree {

    int[] set0 = {-1, -1, -1, -1};
    int[] set1 = {-1, -1, -1, -1};
    int[] set2 = {-1, -1, -1, -1};
    int[] set3 = {-1, -1, -1, -1};
    int memoryBlockSize = 0;

    ArrayList<Integer> inputString = new ArrayList<>();
    int cacheHit = 0;
    int cacheMiss = 0;

    ArrayList<Integer> s0B0_trace = new ArrayList<>();
    ArrayList<Integer> s0B1_trace = new ArrayList<>();
    ArrayList<Integer> s0B2_trace = new ArrayList<>();
    ArrayList<Integer> s0B3_trace = new ArrayList<>();
    ArrayList<Integer> s1B0_trace = new ArrayList<>();
    ArrayList<Integer> s1B1_trace = new ArrayList<>();
    ArrayList<Integer> s1B2_trace = new ArrayList<>();
    ArrayList<Integer> s1B3_trace = new ArrayList<>();
    ArrayList<Integer> s2B0_trace = new ArrayList<>();
    ArrayList<Integer> s2B1_trace = new ArrayList<>();
    ArrayList<Integer> s2B2_trace = new ArrayList<>();
    ArrayList<Integer> s2B3_trace = new ArrayList<>();
    ArrayList<Integer> s3B0_trace = new ArrayList<>();
    ArrayList<Integer> s3B1_trace = new ArrayList<>();
    ArrayList<Integer> s3B2_trace = new ArrayList<>();
    ArrayList<Integer> s3B3_trace = new ArrayList<>();

    public void setMemoryBlockSize(int x){
        this.memoryBlockSize = x;
    }

    public ArrayList<Integer> populateArrayList(){
        this.inputString.add(0);
        int i, j;
        for (i=0; i<2; i++){
            for (j=1; j<this.memoryBlockSize-1; j++){
                this.inputString.add(j);
            }
        }

        for (i=this.memoryBlockSize-1; i<this.memoryBlockSize * 2; i++){
            this.inputString.add(i);
        }

        return this.inputString;
    }

    public void calculate() {

        boolean noDuplicate = false;
        int setZeroCtr = 0; // counter for LGU
        int setOneCtr = 0;
        int setTwoCtr = 0;
        int setThreeCtr = 0;

        int[] tempSet0 = {-4, -3, -2, -1}; // index of each blocks
        int[] tempSet1 = {-4, -3, -2, -1};
        int[] tempSet2 = {-4, -3, -2, -1};
        int[] tempSet3 = {-4, -3, -2, -1};

        int blockNum = 0;
        for (int x = 0; x < 4; x++) {
            for (int i = 0; i < this.inputString.size(); i++) {
                blockNum = this.inputString.get(i) % 4;

                if (set0[0] == this.inputString.get(i)){
                    setZeroCtr++;
                    tempSet0[0] = setZeroCtr;
                    cacheHit++;
                    s0B0_trace.add(this.inputString.get(i));
                }
                else if (set0[1] == this.inputString.get(i)){
                    setZeroCtr++;
                    tempSet0[1] = setZeroCtr;
                    cacheHit++;
                    s0B1_trace.add(this.inputString.get(i));
                }
                else if (set0[2] == this.inputString.get(i)){
                    setZeroCtr++;
                    tempSet0[2] = setZeroCtr;
                    cacheHit++;
                    s0B2_trace.add(this.inputString.get(i));
                }
                else if (set0[3] == this.inputString.get(i)){
                    setZeroCtr++;
                    tempSet0[3] = setZeroCtr;
                    cacheHit++;
                    s0B3_trace.add(this.inputString.get(i));
                }
                else if (set1[0] == this.inputString.get(i)){
                    setOneCtr++;
                    tempSet1[0] = setOneCtr;
                    cacheHit++;
                    s1B0_trace.add(this.inputString.get(i));
                }
                else if (set1[1] == this.inputString.get(i)){
                    setOneCtr++;
                    tempSet1[1] = setOneCtr;
                    cacheHit++;
                    s1B1_trace.add(this.inputString.get(i));
                }
                else if (set1[2] == this.inputString.get(i)){
                    setOneCtr++;
                    tempSet1[2] = setOneCtr;
                    cacheHit++;
                    s1B2_trace.add(this.inputString.get(i));
                }
                else if (set1[3] == this.inputString.get(i)){
                    setOneCtr++;
                    tempSet1[3] = setOneCtr;
                    cacheHit++;
                    s1B3_trace.add(this.inputString.get(i));
                }
                else if (set2[0] == this.inputString.get(i)){
                    setTwoCtr++;
                    tempSet2[0] = setTwoCtr;
                    cacheHit++;
                    s2B0_trace.add(this.inputString.get(i));
                }
                else if (set2[1] == this.inputString.get(i)){
                    setTwoCtr++;
                    tempSet2[1] = setTwoCtr;
                    cacheHit++;
                    s2B1_trace.add(this.inputString.get(i));
                }
                else if (set2[2] == this.inputString.get(i)){
                    setTwoCtr++;
                    tempSet2[2] = setTwoCtr;
                    cacheHit++;
                    s2B2_trace.add(this.inputString.get(i));
                }
                else if (set2[3] == this.inputString.get(i)){
                    setTwoCtr++;
                    tempSet2[3] = setTwoCtr;
                    cacheHit++;
                    s2B3_trace.add(this.inputString.get(i));
                }
                else if (set3[0] == this.inputString.get(i)){
                    setThreeCtr++;
                    tempSet3[0] = setThreeCtr;
                    cacheHit++;
                    s3B0_trace.add(this.inputString.get(i));
                }
                else if (set3[1] == this.inputString.get(i)){
                    setThreeCtr++;
                    tempSet3[1] = setThreeCtr;
                    cacheHit++;
                    s3B1_trace.add(this.inputString.get(i));
                }
                else if (set3[2] == this.inputString.get(i)){
                    setThreeCtr++;
                    tempSet3[2] = setThreeCtr;
                    cacheHit++;
                    s3B2_trace.add(this.inputString.get(i));
                }
                else if (set3[3] == this.inputString.get(i)){
                    setThreeCtr++;
                    tempSet3[3] = setThreeCtr;
                    cacheHit++;
                    s3B3_trace.add(this.inputString.get(i));
                }

                else{
                    cacheMiss++;
                    noDuplicate = true;
                }

                if (noDuplicate){
                    if (blockNum == 0){
                        int minIndex = 0;
                        int minValue = tempSet0[0];

                        for (int j = 0; j < tempSet0.length; j++) {
                            if (tempSet0[j] < minValue) {
                                minValue = tempSet0[j];
                                minIndex = j;
                            }
                        }

                        if (minIndex == 0){
                            set0[0] = this.inputString.get(i);
                            setZeroCtr++;
                            tempSet0[0] = setZeroCtr;
                            s0B0_trace.add(this.inputString.get(i));
                        }
                        else if (minIndex == 1){
                            set0[1] = this.inputString.get(i);
                            setZeroCtr++;
                            tempSet0[1] = setZeroCtr;
                            s0B1_trace.add(this.inputString.get(i));
                        }
                        else if (minIndex == 2){
                            set0[2] = this.inputString.get(i);
                            setZeroCtr++;
                            tempSet0[2] = setZeroCtr;
                            s0B2_trace.add(this.inputString.get(i));
                        }
                        else{
                            set0[3] = this.inputString.get(i);
                            setZeroCtr++;
                            tempSet0[3] = setZeroCtr;
                            s0B3_trace.add(this.inputString.get(i));
                        }

                    }

                    else if (blockNum == 1){
                        int minIndex = 0;
                        int minValue = tempSet1[0];

                        for (int j = 0; j < tempSet1.length; j++) {
                            if (tempSet1[j] < minValue) {
                                minValue = tempSet1[j];
                                minIndex = j;
                            }
                        }

                        if (minIndex == 0){
                            set1[0] = this.inputString.get(i);
                            setOneCtr++;
                            tempSet1[0] = setOneCtr;
                            s1B0_trace.add(this.inputString.get(i));
                        }
                        else if (minIndex == 1){
                            set1[1] = this.inputString.get(i);
                            setOneCtr++;
                            tempSet1[1] = setOneCtr;
                            s1B1_trace.add(this.inputString.get(i));
                        }
                        else if (minIndex == 2){
                            set1[2] = this.inputString.get(i);
                            setOneCtr++;
                            tempSet1[2] = setOneCtr;
                            s1B2_trace.add(this.inputString.get(i));
                        }
                        else {
                            set1[3] = this.inputString.get(i);
                            setOneCtr++;
                            tempSet1[3] = setOneCtr;
                            s1B3_trace.add(this.inputString.get(i));
                        }
                    }

                    else if (blockNum == 2){
                        int minIndex = 0;
                        int minValue = tempSet2[0];

                        for (int j = 0; j < tempSet2.length; j++) {
                            if (tempSet2[j] < minValue) {
                                minValue = tempSet2[j];
                                minIndex = j;
                            }
                        }

                        if (minIndex == 0){
                            set2[0] = this.inputString.get(i);
                            setTwoCtr++;
                            tempSet2[0] = setTwoCtr;
                            s2B0_trace.add(this.inputString.get(i));
                        }
                        else if (minIndex == 1){
                            set2[1] = this.inputString.get(i);
                            setTwoCtr++;
                            tempSet2[1] = setTwoCtr;
                            s2B1_trace.add(this.inputString.get(i));
                        }
                        else if (minIndex == 2){
                            set2[2] = this.inputString.get(i);
                            setTwoCtr++;
                            tempSet2[2] = setTwoCtr;
                            s2B2_trace.add(this.inputString.get(i));
                        }
                        else{
                            set2[3] = this.inputString.get(i);
                            setTwoCtr++;
                            tempSet2[3] = setTwoCtr;
                            s2B3_trace.add(this.inputString.get(i));
                        }

                    }

                    else{
                        int minIndex = 0;
                        int minValue = tempSet3[0];

                        for (int j = 0; j < tempSet3.length; j++) {
                            if (tempSet3[j] < minValue) {
                                minValue = tempSet3[j];
                                minIndex = j;
                            }
                        }

                        if (minIndex == 0){
                            set3[0] = this.inputString.get(i);
                            setThreeCtr++;
                            tempSet3[0] = setThreeCtr;
                            s3B0_trace.add(this.inputString.get(i));
                        }
                        else if (minIndex == 1){
                            set3[1] = this.inputString.get(i);
                            setThreeCtr++;
                            tempSet3[1] = setThreeCtr;
                            s3B1_trace.add(this.inputString.get(i));
                        }
                        else if (minIndex == 2){
                            set3[2] = this.inputString.get(i);
                            setThreeCtr++;
                            tempSet3[2] = setThreeCtr;
                            s3B2_trace.add(this.inputString.get(i));
                        }
                        else{
                            set3[3] = this.inputString.get(i);
                            setThreeCtr++;
                            tempSet3[3] = setThreeCtr;
                            s3B3_trace.add(this.inputString.get(i));
                        }


                    }
                }
                noDuplicate = false;

            }

        }
    }

    public ArrayList<int[]> getSet(){
        ArrayList<int[]> al = new ArrayList<>();
        al.add(set0);
        al.add(set1);
        al.add(set2);
        al.add(set3);

        return al;
    }

    public ArrayList<ArrayList<Integer>> getTrace(){
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.add(s0B0_trace);
        al.add(s0B1_trace);
        al.add(s0B2_trace);
        al.add(s0B3_trace);

        al.add(s1B0_trace);
        al.add(s1B1_trace);
        al.add(s1B2_trace);
        al.add(s1B3_trace);

        al.add(s2B0_trace);
        al.add(s2B1_trace);
        al.add(s2B2_trace);
        al.add(s2B3_trace);

        al.add(s3B0_trace);
        al.add(s3B1_trace);
        al.add(s3B2_trace);
        al.add(s3B3_trace);

        return al;
    }

    public int getCacheMiss(){
        return cacheMiss;
    }

    public int getCacheHit(){
        return cacheHit;
    }
}
