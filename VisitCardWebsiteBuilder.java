package Patterns.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCmc() {
website.setCmc(Cmc.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);

    }
}
