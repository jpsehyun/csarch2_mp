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
                }
                else if (set0[1] == this.inputString.get(i)){
                    setZeroCtr++;
                    tempSet0[1] = setZeroCtr;
                    cacheHit++;
                }
                else if (set0[2] == this.inputString.get(i)){
                    setZeroCtr++;
                    tempSet0[2] = setZeroCtr;
                    cacheHit++;
                }
                else if (set0[3] == this.inputString.get(i)){
                    setZeroCtr++;
                    tempSet0[3] = setZeroCtr;
                    cacheHit++;
                }
                else if (set1[0] == this.inputString.get(i)){
                    setOneCtr++;
                    tempSet1[0] = setOneCtr;
                    cacheHit++;
                }
                else if (set1[1] == this.inputString.get(i)){
                    setOneCtr++;
                    tempSet1[1] = setOneCtr;
                    cacheHit++;
                }
                else if (set1[2] == this.inputString.get(i)){
                    setOneCtr++;
                    tempSet1[2] = setOneCtr;
                    cacheHit++;
                }
                else if (set1[3] == this.inputString.get(i)){
                    setOneCtr++;
                    tempSet1[3] = setOneCtr;
                    cacheHit++;
                }
                else if (set2[0] == this.inputString.get(i)){
                    setTwoCtr++;
                    tempSet2[0] = setTwoCtr;
                    cacheHit++;
                }
                else if (set2[1] == this.inputString.get(i)){
                    setTwoCtr++;
                    tempSet2[1] = setTwoCtr;
                    cacheHit++;
                }
                else if (set2[2] == this.inputString.get(i)){
                    setTwoCtr++;
                    tempSet2[2] = setTwoCtr;
                    cacheHit++;
                }
                else if (set2[3] == this.inputString.get(i)){
                    setTwoCtr++;
                    tempSet2[3] = setTwoCtr;
                    cacheHit++;
                }
                else if (set3[0] == this.inputString.get(i)){
                    setThreeCtr++;
                    tempSet3[0] = setThreeCtr;
                    cacheHit++;
                }
                else if (set3[1] == this.inputString.get(i)){
                    setThreeCtr++;
                    tempSet3[1] = setThreeCtr;
                    cacheHit++;
                }
                else if (set3[2] == this.inputString.get(i)){
                    setThreeCtr++;
                    tempSet3[2] = setThreeCtr;
                    cacheHit++;
                }
                else if (set3[3] == this.inputString.get(i)){
                    setThreeCtr++;
                    tempSet3[3] = setThreeCtr;
                    cacheHit++;
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
                        }
                        else if (minIndex == 1){
                            set0[1] = this.inputString.get(i);
                            setZeroCtr++;
                            tempSet0[1] = setZeroCtr;
                        }
                        else if (minIndex == 2){
                            set0[2] = this.inputString.get(i);
                            setZeroCtr++;
                            tempSet0[2] = setZeroCtr;
                        }
                        else{
                            set0[3] = this.inputString.get(i);
                            setZeroCtr++;
                            tempSet0[3] = setZeroCtr;
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
                        }
                        else if (minIndex == 1){
                            set1[1] = this.inputString.get(i);
                            setOneCtr++;
                            tempSet1[1] = setOneCtr;
                        }
                        else if (minIndex == 2){
                            set1[2] = this.inputString.get(i);
                            setOneCtr++;
                            tempSet1[2] = setOneCtr;
                        }
                        else {
                            set1[3] = this.inputString.get(i);
                            setOneCtr++;
                            tempSet1[3] = setOneCtr;
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
                        }
                        else if (minIndex == 1){
                            set2[1] = this.inputString.get(i);
                            setTwoCtr++;
                            tempSet2[1] = setTwoCtr;
                        }
                        else if (minIndex == 2){
                            set2[2] = this.inputString.get(i);
                            setTwoCtr++;
                            tempSet2[2] = setTwoCtr;
                        }
                        else{
                            set2[3] = this.inputString.get(i);
                            setTwoCtr++;
                            tempSet2[3] = setTwoCtr;
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
                        }
                        else if (minIndex == 1){
                            set3[1] = this.inputString.get(i);
                            setThreeCtr++;
                            tempSet3[1] = setThreeCtr;
                        }
                        else if (minIndex == 2){
                            set3[2] = this.inputString.get(i);
                            setThreeCtr++;
                            tempSet3[2] = setThreeCtr;
                        }
                        else{
                            set3[3] = this.inputString.get(i);
                            setThreeCtr++;
                            tempSet3[3] = setThreeCtr;
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

    public int getCacheMiss(){
        return cacheMiss;
    }

    public int getCacheHit(){
        return cacheHit;
    }
}
