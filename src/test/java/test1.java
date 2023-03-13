import java.util.SortedMap;
/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
*/

class Main {
    public static void main(String[] args) {
        청둥오리 청둥오리=new 청둥오리();
        청둥오리.날다();
        흰오리 흰오리= new 흰오리();
        흰오리.날다();
        고무오리 고무오리=new 고무오리();
        고무오리.날다();
        고무2오리 고무2오리=new 고무2오리();
        고무2오리.날다();

    }
}

class 오리{
    void 날다(){
        System.out.println("날 수 있다.");
    }
}

class 청둥오리 extends 오리{

}

class 흰오리 extends 오리{

}

class 고무오리 extends 오리{
    void 날다(){
        System.out.println("이 오리는 못날아");
    }
}

class 고무2오리 extends 고무오리{

}

