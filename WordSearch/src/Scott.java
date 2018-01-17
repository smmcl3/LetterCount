public class Scott {
    String Sentence;

    public Scott(String sentence) {
        Sentence = sentence;
    }
    public String getSentence() {
        return Sentence;
    }

    public void main(String[] args) {
    String[] singleWord=Sentence.split(" ");
    String answer=" ";

    for(int i=0;i<singleWord.length;i++){
        if(singleWord[i].length()>=answer.length()){
            answer=singleWord[i];
        }
        System.out.println(answer);
        System.out.println(answer.length());
        }
    }
}
