
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SampleController {
    @FXML
    public TextField cacheBlockTf;
    @FXML
    public TextField memoryBlockTf;
    @FXML
    public TextArea inputTa;

    // Results Fx
    @FXML
    public TextField memoryAccessCountTf;
    @FXML
    public TextField cacheHitCountTf;
    @FXML
    public TextField cacheMissCountTf;
    @FXML
    public TextField cacheHitRateTf;
    @FXML
    public TextField cacheMissRateTf;
    @FXML
    public TextField averageMATTf;
    @FXML
    public TextField totalMATTf;

    // Cache Set and Block
    @FXML
    public TextArea s0B0;
    @FXML
    public TextArea s1B0;
    @FXML
    public TextArea s2B0;
    @FXML
    public TextArea s3B0;
    @FXML
    public TextArea s0B1;
    @FXML
    public TextArea s1B1;
    @FXML
    public TextArea s2B1;
    @FXML
    public TextArea s3B1;
    @FXML
    public TextArea s0B2;
    @FXML
    public TextArea s1B2;
    @FXML
    public TextArea s2B2;
    @FXML
    public TextArea s3B2;
    @FXML
    public TextArea s0B3;
    @FXML
    public TextArea s1B3;
    @FXML
    public TextArea s2B3;
    @FXML
    public TextArea s3B3;

    // buttons
    @FXML public Button toggleBtn;
    @FXML public Button tc1Btn;

    @FXML
    private void testCaseOne() {

        if (memoryBlockTf.getText().trim().isEmpty()) {
            memoryBlockTf.setStyle("-fx-background-color: red");
        } else {
            memoryBlockTf.setStyle("-fx-background-color: white");
        }

        if (!(memoryBlockTf.getText().trim().isEmpty())) {
            inputTa.setText("");
            ArrayList<int[]> al = new ArrayList<>();
            TestCaseOne t1 = new TestCaseOne();

            t1.setMemoryBlockSize(Integer.parseInt(memoryBlockTf.getText()));
            t1.calculate();

            // Miss Count
            int missCtr = t1.getCacheMiss();
            cacheMissCountTf.setText(String.valueOf(missCtr));

            // Hit Count
            int hitCtr = t1.getCacheHit();
            cacheHitCountTf.setText(String.valueOf(hitCtr));

            // Prints the input String
            for (int i = 0; i < Integer.parseInt(memoryBlockTf.getText()); i++) {
                String x = inputTa.getText();
                String z = x + " " + String.valueOf(i);
                inputTa.setText(z);
            }
            String temp = inputTa.getText();
            inputTa.setText(temp + "\n (x4)");

            // Memory Access Count
            int MAC = (t1.getCacheMiss()) + (t1.getCacheHit());
            memoryAccessCountTf.setText(String.valueOf(MAC));

            // Hit Rate = Hit Count / Memory Access Count
            float HR = (float) hitCtr / (float) MAC;
            cacheHitRateTf.setText(String.valueOf(HR * 100));

            // Miss Rate = Miss Count / Memory Access Count
            float MR = (float) missCtr / (float) MAC;
            cacheMissRateTf.setText(String.valueOf(MR * 100));

            // Average Memory Access Time
            // Tavg = hC + (1 - h) * M
            // M = 1ns + (10ns * 32)
            int M = 32 * 10 + 1;
            float Tavg = HR * 1 + MR * M;
            averageMATTf.setText(String.valueOf(Tavg));

            // Total Memory Access Time
            // Ttotal = Hit (32 * 1ns) + MISS (1ns + 32 * 10ns)
            float Ttotal = hitCtr * 32 + missCtr * (1 + 32 * 10);
            totalMATTf.setText(String.valueOf(Ttotal));


            al = t1.getSet();

            s0B0.setText(String.valueOf(al.get(0)[0]));
            s0B1.setText(String.valueOf(al.get(0)[1]));
            s0B2.setText(String.valueOf(al.get(0)[2]));
            s0B3.setText(String.valueOf(al.get(0)[3]));
            s1B0.setText(String.valueOf(al.get(1)[0]));
            s1B1.setText(String.valueOf(al.get(1)[1]));
            s1B2.setText(String.valueOf(al.get(1)[2]));
            s1B3.setText(String.valueOf(al.get(1)[3]));
            s2B0.setText(String.valueOf(al.get(2)[0]));
            s2B1.setText(String.valueOf(al.get(2)[1]));
            s2B2.setText(String.valueOf(al.get(2)[2]));
            s2B3.setText(String.valueOf(al.get(2)[3]));
            s3B0.setText(String.valueOf(al.get(3)[0]));
            s3B1.setText(String.valueOf(al.get(3)[1]));
            s3B2.setText(String.valueOf(al.get(3)[2]));
            s3B3.setText(String.valueOf(al.get(3)[3]));
        }
    }

}