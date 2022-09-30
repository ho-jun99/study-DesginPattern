package adapter.fighterExample;

public class WizardAdapter implements Fighter{

    Wizard wizard;

    WizardAdapter(String name, int level){
        wizard = new Wizard(name,level);
    }

    @Override
    public void attack() {
        wizard.shotMagicCloser();
    }

    @Override
    public void defend() {
        wizard.shield();
    }

    @Override
    public void goHome() {
        wizard.portal();
    }
}
