package davids.app.contreras.com.chordsapp;

        import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    private RadioGroup radioGroup;
    private ToggleButton tb1,tb2,tb3,tb4,tb5,tb6,tb7,tb8,tb9,tb10,tb11,tb12,tb13,tb14,tb15,tb16,tb17,tb18,tb19,tb20,tb21,tb22,tb23;
    String []Acordes={"C","C#/Db","D","D#/Eb","E","F","F#/Gb","G","G#/Ab","A","A#/Bb","B"};
    ImageView imagenes;
    private int[] Do = {R.drawable.pianodomaj,R.drawable.pianodomenor,R.drawable.pianodoaug,R.drawable.pianodosus,R.drawable.pianododim,
            R.drawable.pianodomajsiete, R.drawable.pianodomenorsiete,R.drawable.pianodomenormajorsiete,R.drawable.pianodosiete,
            R.drawable.pianodosientemenoscinco,R.drawable.pianodosuscuatro,R.drawable.pianodosietesuscuatro,R.drawable.pianodomenoscinco,R.drawable.pianodoseis,
            R.drawable.pianodomenorseis,R.drawable.pianoseisaddnueve,R.drawable.pianodonueve,R.drawable.pianodomajnueve,R.drawable.pianodomenornueve,
            R.drawable.pianodoaddnueve,R.drawable.pianodoaugsiete,R.drawable.pianodoaugmajsiete,R.drawable.pianodosussiete};
    private int[] Dosos = {R.drawable.pianodossosmaj};
    private int[] Re = {R.drawable.pianoremaj};
    private int[] Resos = {R.drawable.pianoresosmaj};
    private int[] Mi = {R.drawable.pianomimaj};
    private int[] Fa = {R.drawable.pianofamaj};
    private int[] Fasos = {R.drawable.pianofasosmaj};
    private int[] Sol = {R.drawable.pianosolmaj};
    private int[] Solsos = {R.drawable.pianosolsosmaj};
    private int[] La = {R.drawable.pianolamaj};
    private int[] Lasos = {R.drawable.pianolassosmaj};
    private int[] Si = {R.drawable.pianosimaj};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        imagenes=(ImageView)findViewById(R.id.imageView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Acordes);
        spinner1.setAdapter(adapter);

        tb1=(ToggleButton)findViewById(R.id.tb1);tb2=(ToggleButton)findViewById(R.id.tb2);tb3=(ToggleButton)findViewById(R.id.tb3);tb4=(ToggleButton)findViewById(R.id.tb4);tb5=(ToggleButton)findViewById(R.id.tb5);
        tb6=(ToggleButton)findViewById(R.id.tb6);tb7=(ToggleButton)findViewById(R.id.tb7);tb8=(ToggleButton)findViewById(R.id.tb8);tb9=(ToggleButton)findViewById(R.id.tb9);tb10=(ToggleButton)findViewById(R.id.tb10);
        tb11=(ToggleButton)findViewById(R.id.tb11);tb12=(ToggleButton)findViewById(R.id.tb12);tb13=(ToggleButton)findViewById(R.id.tb13);tb14=(ToggleButton)findViewById(R.id.tb14);tb15=(ToggleButton)findViewById(R.id.tb15);
        tb16=(ToggleButton)findViewById(R.id.tb16);tb17=(ToggleButton)findViewById(R.id.tb17);tb18=(ToggleButton)findViewById(R.id.tb18);tb19=(ToggleButton)findViewById(R.id.tb19);tb20=(ToggleButton)findViewById(R.id.tb20);
        tb21=(ToggleButton)findViewById(R.id.tb21);tb22=(ToggleButton)findViewById(R.id.tb22);tb23=(ToggleButton)findViewById(R.id.tb23);

        tb1.setOnCheckedChangeListener(toggleListener);tb2.setOnCheckedChangeListener(toggleListener);tb3.setOnCheckedChangeListener(toggleListener);tb4.setOnCheckedChangeListener(toggleListener);tb5.setOnCheckedChangeListener(toggleListener);
        tb6.setOnCheckedChangeListener(toggleListener);tb7.setOnCheckedChangeListener(toggleListener);tb8.setOnCheckedChangeListener(toggleListener);tb9.setOnCheckedChangeListener(toggleListener);tb10.setOnCheckedChangeListener(toggleListener);
        tb11.setOnCheckedChangeListener(toggleListener);tb12.setOnCheckedChangeListener(toggleListener);tb13.setOnCheckedChangeListener(toggleListener);tb14.setOnCheckedChangeListener(toggleListener);tb15.setOnCheckedChangeListener(toggleListener);
        tb16.setOnCheckedChangeListener(toggleListener);tb17.setOnCheckedChangeListener(toggleListener);tb18.setOnCheckedChangeListener(toggleListener);tb19.setOnCheckedChangeListener(toggleListener);tb20.setOnCheckedChangeListener(toggleListener);
        tb21.setOnCheckedChangeListener(toggleListener);tb22.setOnCheckedChangeListener(toggleListener);tb23.setOnCheckedChangeListener(toggleListener);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String  selec=spinner1.getSelectedItem().toString();

                   switch(selec){
                    case "C":

                        if(tb1.isChecked()) {
                                imagenes.setImageResource(Do[0]);
                        }else if(tb2.isChecked()){
                            imagenes.setImageResource(Do[1]);
                        }else if(tb3.isChecked()){
                            imagenes.setImageResource(Do[2]);
                        }else if(tb4.isChecked()){
                            imagenes.setImageResource(Do[3]);
                        }else if(tb5.isChecked()){
                            imagenes.setImageResource(Do[4]);
                        }else if(tb6.isChecked()){
                            imagenes.setImageResource(Do[5]);
                        }else if(tb7.isChecked()){
                            imagenes.setImageResource(Do[6]);
                        }else if(tb8.isChecked()){
                            imagenes.setImageResource(Do[7]);
                        }else if(tb9.isChecked()){
                            imagenes.setImageResource(Do[8]);
                        }else if(tb10.isChecked()){
                            imagenes.setImageResource(Do[9]);
                        }else if(tb11.isChecked()){
                            imagenes.setImageResource(Do[10]);
                        }else if(tb12.isChecked()){
                            imagenes.setImageResource(Do[11]);
                        }else if(tb13.isChecked()){
                            imagenes.setImageResource(Do[12]);
                        }else if(tb14.isChecked()){
                            imagenes.setImageResource(Do[13]);
                        }else if(tb15.isChecked()){
                            imagenes.setImageResource(Do[14]);
                        }else if(tb16.isChecked()){
                            imagenes.setImageResource(Do[15]);
                        }else if(tb17.isChecked()){
                            imagenes.setImageResource(Do[16]);
                        }else if(tb18.isChecked()){
                            imagenes.setImageResource(Do[17]);
                        }else if(tb19.isChecked()){
                            imagenes.setImageResource(Do[18]);
                        }else if(tb20.isChecked()){
                            imagenes.setImageResource(Do[19]);
                        }else if(tb21.isChecked()){
                            imagenes.setImageResource(Do[20]);
                        }else if(tb22.isChecked()){
                            imagenes.setImageResource(Do[21]);
                        }
                        break;
                    case "C#/Db":
                        if(tb1.isChecked()) {
                            imagenes.setImageResource(Dosos[0]);
                        }
                        break;
                    case "D":
                        if(tb1.isChecked()) {
                            imagenes.setImageResource(Re[0]);
                        }
                        break;
                    case "D#/Eb":
                        if(tb1.isChecked()) {
                            imagenes.setImageResource(Resos[0]);
                        }
                        break;
                    case "E":
                        if(tb1.isChecked()) {
                            imagenes.setImageResource(Mi[0]);
                        }
                        break;
                    case "F":
                        if(tb1.isChecked()) {
                            imagenes.setImageResource(Fa[0]);
                        }
                        break;
                    case "F#/Gb":
                        if(tb1.isChecked()) {
                            imagenes.setImageResource(Fasos[0]);
                        }
                        break;
                    case "G":
                        if(tb1.isChecked()) {
                            imagenes.setImageResource(Sol[0]);
                        }
                        break;
                        case "G#/Ab":
                            if(tb1.isChecked()) {
                                imagenes.setImageResource(Solsos[0]);
                            }
                        break;
                    case "A":
                        if(tb1.isChecked()) {
                            imagenes.setImageResource(La[0]);
                        }
                        break;
                    case "A#/Bb":
                        if(tb1.isChecked()) {
                            imagenes.setImageResource(Lasos[0]);
                        }
                        break;
                    case "B":
                        if(tb1.isChecked()) {
                            imagenes.setImageResource(Si[0]);
                        }
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private CompoundButton.OnCheckedChangeListener toggleListener = new CompoundButton.OnCheckedChangeListener()
    {
        boolean avoidRecursions = false;

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
        {
            if(avoidRecursions) return;
            avoidRecursions = true;

            // don't allow the un-checking
            if(!isChecked)
            {
                buttonView.setChecked(true);
                avoidRecursions = false;
                return;
            }

            // un-check the previous checked button
            if(buttonView != tb1 && tb1.isChecked()) tb1.setChecked(false);
            else if(buttonView != tb2 && tb2.isChecked()) tb2.setChecked(false);
            else if(buttonView != tb3 && tb3.isChecked()) tb3.setChecked(false);
            else if(buttonView != tb4 && tb4.isChecked()) tb4.setChecked(false);
            else if(buttonView != tb5 && tb5.isChecked()) tb5.setChecked(false);
            else if(buttonView != tb6 && tb6.isChecked()) tb6.setChecked(false);
            else if(buttonView != tb7 && tb7.isChecked()) tb7.setChecked(false);
            else if(buttonView != tb8 && tb8.isChecked()) tb8.setChecked(false);
            else if(buttonView != tb9 && tb9.isChecked()) tb9.setChecked(false);
            else if(buttonView != tb10 && tb10.isChecked()) tb10.setChecked(false);
            else if(buttonView != tb11 && tb11.isChecked()) tb11.setChecked(false);
            else if(buttonView != tb12 && tb12.isChecked()) tb12.setChecked(false);
            else if(buttonView != tb13 && tb13.isChecked()) tb13.setChecked(false);
            else if(buttonView != tb14 && tb14.isChecked()) tb14.setChecked(false);
            else if(buttonView != tb15 && tb15.isChecked()) tb15.setChecked(false);
            else if(buttonView != tb16 && tb16.isChecked()) tb16.setChecked(false);
            else if(buttonView != tb17 && tb17.isChecked()) tb17.setChecked(false);
            else if(buttonView != tb18 && tb18.isChecked()) tb18.setChecked(false);
            else if(buttonView != tb19 && tb19.isChecked()) tb19.setChecked(false);
            else if(buttonView != tb20 && tb20.isChecked()) tb20.setChecked(false);
            else if(buttonView != tb21 && tb21.isChecked()) tb21.setChecked(false);
            else if(buttonView != tb22 && tb22.isChecked()) tb22.setChecked(false);
            else if(buttonView != tb23 && tb23.isChecked()) tb23.setChecked(false);


            avoidRecursions = false;
        }
    };


   public void check(View view){
       boolean checked = ((ToggleButton) view).isChecked();
       String  selec=spinner1.getSelectedItem().toString();
       switch(view.getId()) {
           case R.id.tb1:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[0]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[0]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[0]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[0]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[0]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[0]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[0]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[0]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[0]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[0]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[0]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[0]);
                           break;
                   }

               }
               break;
           case R.id.tb2:
               if (checked){ switch(selec){
                   case "C":
                       imagenes.setImageResource(Do[1]);
                       break;
                   case "C#/Db":
                       imagenes.setImageResource(Dosos[1]);
                       break;
                   case "D":
                       imagenes.setImageResource(Re[1]);
                       break;
                   case "D#/Eb":
                       imagenes.setImageResource(Resos[1]);
                       break;
                   case "E":
                       imagenes.setImageResource(Mi[1]);
                       break;
                   case "F":
                       imagenes.setImageResource(Fa[1]);
                       break;
                   case "F#/Gb":
                       imagenes.setImageResource(Fasos[1]);
                       break;
                   case "G":
                       imagenes.setImageResource(Sol[1]);
                       break;
                   case "G#/Ab":
                       imagenes.setImageResource(Solsos[1]);
                       break;
                   case "A":
                       imagenes.setImageResource(La[1]);
                       break;
                   case "A#/Bb":
                       imagenes.setImageResource(Lasos[1]);
                       break;
                   case "B":
                       imagenes.setImageResource(Si[1]);
                       break;
               }


               }
               break;
           case R.id.tb3:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[2]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[2]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[2]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[2]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[2]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[2]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[2]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[2]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[2]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[2]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[2]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[2]);
                           break;
                   }
               }
               break;
           case R.id.tb4:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[3]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[3]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[3]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[3]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[3]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[3]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[3]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[3]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[3]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[3]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[3]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[3]);
                           break;
                   }

               }
               break;
           case R.id.tb5:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[4]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[4]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[4]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[4]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[4]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[4]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[4]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[4]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[4]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[4]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[4]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[4]);
                           break;
                   }

               }
               break;
           case R.id.tb6:
               if (checked){switch(selec){
                   case "C":
                       imagenes.setImageResource(Do[5]);
                       break;
                   case "C#/Db":
                       imagenes.setImageResource(Dosos[5]);
                       break;
                   case "D":
                       imagenes.setImageResource(Re[5]);
                       break;
                   case "D#/Eb":
                       imagenes.setImageResource(Resos[5]);
                       break;
                   case "E":
                       imagenes.setImageResource(Mi[5]);
                       break;
                   case "F":
                       imagenes.setImageResource(Fa[5]);
                       break;
                   case "F#/Gb":
                       imagenes.setImageResource(Fasos[5]);
                       break;
                   case "G":
                       imagenes.setImageResource(Sol[5]);
                       break;
                   case "G#/Ab":
                       imagenes.setImageResource(Solsos[5]);
                       break;
                   case "A":
                       imagenes.setImageResource(La[5]);
                       break;
                   case "A#/Bb":
                       imagenes.setImageResource(Lasos[5]);
                       break;
                   case "B":
                       imagenes.setImageResource(Si[5]);
                       break;
               }
               }
               break;
           case R.id.tb7:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[6]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[6]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[6]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[6]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[6]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[6]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[6]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[6]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[6]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[6]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[6]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[6]);
                           break;
                   }

               }
               break;
           case R.id.tb8:
               if (checked){switch(selec){
                   case "C":
                       imagenes.setImageResource(Do[7]);
                       break;
                   case "C#/Db":
                       imagenes.setImageResource(Dosos[7]);
                       break;
                   case "D":
                       imagenes.setImageResource(Re[7]);
                       break;
                   case "D#/Eb":
                       imagenes.setImageResource(Resos[7]);
                       break;
                   case "E":
                       imagenes.setImageResource(Mi[7]);
                       break;
                   case "F":
                       imagenes.setImageResource(Fa[7]);
                       break;
                   case "F#/Gb":
                       imagenes.setImageResource(Fasos[7]);
                       break;
                   case "G":
                       imagenes.setImageResource(Sol[7]);
                       break;
                   case "G#/Ab":
                       imagenes.setImageResource(Solsos[7]);
                       break;
                   case "A":
                       imagenes.setImageResource(La[7]);
                       break;
                   case "A#/Bb":
                       imagenes.setImageResource(Lasos[7]);
                       break;
                   case "B":
                       imagenes.setImageResource(Si[7]);
                       break;
               }

               }
               break;
           case R.id.tb9:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[8]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[8]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[8]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[8]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[8]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[8]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[8]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[8]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[8]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[8]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[8]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[8]);
                           break;
                   }

               }
               break;
           case R.id.tb10:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[9]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[9]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[9]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[9]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[9]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[9]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[9]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[9]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[9]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[9]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[9]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[9]);
                           break;
                   }

               }
               break;
           case R.id.tb11:
               if (checked){switch(selec){
                   case "C":
                       imagenes.setImageResource(Do[10]);
                       break;
                   case "C#/Db":
                       imagenes.setImageResource(Dosos[10]);
                       break;
                   case "D":
                       imagenes.setImageResource(Re[10]);
                       break;
                   case "D#/Eb":
                       imagenes.setImageResource(Resos[10]);
                       break;
                   case "E":
                       imagenes.setImageResource(Mi[10]);
                       break;
                   case "F":
                       imagenes.setImageResource(Fa[10]);
                       break;
                   case "F#/Gb":
                       imagenes.setImageResource(Fasos[10]);
                       break;
                   case "G":
                       imagenes.setImageResource(Sol[10]);
                       break;
                   case "G#/Ab":
                       imagenes.setImageResource(Solsos[10]);
                       break;
                   case "A":
                       imagenes.setImageResource(La[10]);
                       break;
                   case "A#/Bb":
                       imagenes.setImageResource(Lasos[10]);
                       break;
                   case "B":
                       imagenes.setImageResource(Si[10]);
                       break;
               }

               }
               break;
           case R.id.tb12:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[11]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[11]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[11]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[11]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[11]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[11]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[11]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[11]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[11]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[11]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[11]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[11]);
                           break;
                   }

               }
               break;
           case R.id.tb13:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[12]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[12]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[12]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[12]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[12]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[12]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[12]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[12]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[12]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[12]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[12]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[12]);
                           break;
                   }

               }
               break;
           case R.id.tb14:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[13]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[13]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[13]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[13]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[13]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[13]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[13]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[13]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[13]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[13]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[13]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[13]);
                           break;
                   }

               }
               break;
           case R.id.tb15:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[14]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[14]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[14]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[14]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[14]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[14]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[14]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[14]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[14]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[14]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[14]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[14]);
                           break;
                   }

               }
               break;
           case R.id.tb16:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[15]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[15]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[15]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[15]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[15]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[15]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[15]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[15]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[15]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[15]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[15]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[15]);
                           break;
                   }

               }
               break;
           case R.id.tb17:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[16]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[16]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[16]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[16]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[16]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[16]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[16]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[16]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[16]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[16]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[16]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[16]);
                           break;
                   }

               }
               break;
           case R.id.tb18:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[17]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[17]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[17]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[17]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[17]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[17]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[17]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[17]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[17]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[17]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[17]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[17]);
                           break;
                   }
               }
               break;
           case R.id.tb19:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[18]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[18]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[18]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[18]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[18]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[18]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[18]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[18]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[18]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[18]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[18]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[18]);
                           break;
                   }

               }
               break;
           case R.id.tb20:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[19]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[19]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[19]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[19]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[19]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[19]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[19]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[19]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[19]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[19]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[19]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[19]);
                           break;
                   }

               }
               break;
           case R.id.tb21:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[20]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[20]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[20]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[20]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[20]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[20]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[20]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[20]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[20]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[20]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[20]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[20]);
                           break;
                   }

               }
               break;
           case R.id.tb22:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[21]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[21]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[21]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[21]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[21]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[21]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[21]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[21]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[21]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[21]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[21]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[21]);
                           break;
                   }
               }
               break;

           case R.id.tb23:
               if (checked){
                   switch(selec){
                       case "C":
                           imagenes.setImageResource(Do[22]);
                           break;
                       case "C#/Db":
                           imagenes.setImageResource(Dosos[22]);
                           break;
                       case "D":
                           imagenes.setImageResource(Re[22]);
                           break;
                       case "D#/Eb":
                           imagenes.setImageResource(Resos[22]);
                           break;
                       case "E":
                           imagenes.setImageResource(Mi[22]);
                           break;
                       case "F":
                           imagenes.setImageResource(Fa[22]);
                           break;
                       case "F#/Gb":
                           imagenes.setImageResource(Fasos[22]);
                           break;
                       case "G":
                           imagenes.setImageResource(Sol[22]);
                           break;
                       case "G#/Ab":
                           imagenes.setImageResource(Solsos[22]);
                           break;
                       case "A":
                           imagenes.setImageResource(La[22]);
                           break;
                       case "A#/Bb":
                           imagenes.setImageResource(Lasos[22]);
                           break;
                       case "B":
                           imagenes.setImageResource(Si[22]);
                           break;
                   }
               }
               break;

       }

   }

}
