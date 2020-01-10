class RnaTranscription {

     String transcribe(String dnaStrand) {
        String transcribed_rna_string="";
        
        for(char character : dnaStrand.toCharArray()) {

            if(character == 'A'){
                transcribed_rna_string+='U';
            }
            else if(character == 'C'){
                transcribed_rna_string+='G';
            }
            else if(character == 'T'){
                transcribed_rna_string+='A';
            }
            else if(character == 'G'){
                transcribed_rna_string+='C';
            }
        }
        return transcribed_rna_string;
    }
    
}
