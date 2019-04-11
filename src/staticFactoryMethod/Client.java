package staticFactoryMethod;

import BuilderPattern.NutritionFacts;

public class Client {
    public static void main(String[] args){
        Provider testP = new TestProvider();
        Services.registerDefaultProvider(testP);
        Service s = Services.newInstance();
        s.usingService();
        NutritionFacts latiao = new NutritionFacts.Builder(240,8).calories(100).sodium(35).carbohydrate(27).build();

    }
}
