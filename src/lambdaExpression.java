import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class lambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(9);
        sayilar.add(11);
        sayilar.add(12);
        System.out.println(sayilar);

        ArrayList<Integer> ikikat = new ArrayList<>();
        sayilar.forEach(p->ikikat.add(p*2));
        System.out.println(ikikat);

        //MAP
        List<Integer> lm = sayilar.stream().map(p->p+2) .collect(Collectors.toList());
        System.out.println(lm);

        //Filter
        List<Integer>lf = sayilar.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(lf);

        //REDUCE
        Optional<Integer> toplam = sayilar.stream().reduce((x, y)->x+y);
        System.out.println(toplam);
    }
}