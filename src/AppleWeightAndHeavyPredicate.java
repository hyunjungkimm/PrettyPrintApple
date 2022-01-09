public class AppleWeightAndHeavyPredicate implements AppleFormatter {

    @Override
    public String accept(Apple apple) {
        if(apple.getWeight() > 150){
            return "무게 : " +apple.getWeight() + ", 무겁다"; 
        }else{
            return "무게 : " +apple.getWeight() + ", 가볍다";
        }
        
    }
}
