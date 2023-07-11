public class Sequencer {

    public static void main(String[] args) {

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String[] dnaSequences = {dna1, dna2, dna3};

        for(int i = 0; i < dnaSequences.length;i++){
            if(dnaSequences[i].indexOf("ATG") != -1 && dnaSequences[i].indexOf("TGA") != -1 && dnaSequences[i].substring(dnaSequences[i].indexOf("ATG"), dnaSequences[i].indexOf("TGA")).length() %3 == 0){
                String protein = dnaSequences[i].substring(dnaSequences[i].indexOf("ATG")+3, dnaSequences[i].indexOf("TGA"));
                System.out.println("Contains protein: " + protein);
            }
            else{
                System.out.println("No protein");
            }
        }
    }
}
