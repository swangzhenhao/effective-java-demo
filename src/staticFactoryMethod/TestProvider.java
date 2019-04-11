package staticFactoryMethod;

public class TestProvider implements Provider{
    @Override
    public Service setNewService(){
        return new TestService();
    }
}
