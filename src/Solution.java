import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i<participant.length;i++){
            if(map.keySet().contains(participant[i])){
                int num =  map.get(participant[i]);
                map.put(participant[i],num+1);
            }else{
                map.put(participant[i],1);
            }
        }
        for(int j = 0; j<completion.length;j++){
            if(map.get(completion[j])==1){
                int num =  map.get(completion[j]);
                map.put(completion[j],num-1);
            }
            else if(map.get(completion[j])>1){
                int num =  map.get(completion[j]);
                map.put(completion[j],num-1);
            }
        }
        for(int i=0 ; i<participant.length;i++){
            if(map.get(participant[i])==1){
                answer = participant[i];
            }
        }
        return answer;
    }
}

