package com.myproject.healthappforelders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {
    ListView list;
    String[] title = {"Homemade protein smoothies", "Milk", "Rice", "Nuts and nut butters", "Jowar Medley", "Oats Idli"};
    int[] imageId = {R.drawable.homemade_protein, R.drawable.milk, R.drawable.rice,R.drawable.nuts, R.drawable.jowar_medley,R.drawable.oats_idli};
    String[] timing = {"in the morning either at least 1 hour before your workout, or directly after your session",
            "As per Ayurveda, the best time to consume milk for adults is before bedtime. As for kids, Ayurveda recommends an early morning dose of milk.",
            "As per studies, lunch time is the best time to have rice",
            "Morning",
            "Evening",
            "Morning"};
    String[] ingerdient = {"> 2 to 2 1/2 cups cubed soft fruit, fresh or frozen, or a combination\n" +
            "> 1 cup of liquid, usually juice or milk\n" +
            "> 1/2 cup of yogurt (optional)\n" +
            "> 1/2 cup to 1 cup ice (unless you are using all frozen fruit)\n" +
            "> a teaspoon or two of sugar, honey, agave or another sweetener (optional)",
            "Milk", "Rice",
            "> 3 cups raw (or sprouted) nuts (my favorites = almonds, cashews, walnuts, pecans, hazelnuts // organic unpasteurized when possible)",
            "> 1 Tbsp rice bran oil2 tbsp mustard seeds \n> 15-20 curry leavesgreen chillies (de-seeded) \n> 1 tbsp ginger \n> 2-3 baby corn (diced) \n> 1/2 zucchini, chopped \n> 1 red pepper, chopped \n> 1 yellow pepper, chopped \n> to taste pepper \n> to taste salt1 cup jowar seeds (sorghum)",
            "> ½ teaspoon cumin seeds\n" + "> ½ teaspoon mustard seeds\n" + "> 1 teaspoon chana dal (husked and split bengal gram)\n" + "> ½ teaspoon crushed black pepper\n" + "> 1 tablespoon of chopped coriander leaves (cilantro)\n" + "> 1 teaspoon finely chopped curry leaves\n" + "> 1 teaspoon of finely chopped ginger\n" + "> 1 teaspoon chopped green chilies\n" + "> 8 to 10 cashews that have been chopped"};
    String[] method = {"1. Put the ingredients in a blender and whir it up!\n" +
            "2. This will make two large smoothies", "Milk", "Rice", "1.Preheat oven to 350 degrees F (176 C) and add raw nuts to the baking sheet. If sprouted, nuts won't need as long to roast and benefit from a 5-8 minute roast at a lower temperature (325 F or 162 C). Roast raw nuts for 8-12 minutes, or until fragrant and slightly golden brown.\n" +
            "NOTE: You can also leave nuts raw, but the only ones that taste good raw in my opinion are cashews and almonds.\n" +
            "2.If roasting hazelnuts, remove from oven once toasted and transfer to a clean dish towel. Rub the hazelnuts against one another using the towel to remove the skins (see photo). Removing most of the skins is preferred (not all will come off).\n" +
            "3.Add roasted nuts to a food processor or blender and blend / mix until a creamy butter forms. The nuts should go from whole, to meal, to clumps, to creamy nut butter. This can take up to 10-12 or more minutes so be patient. Scrape down sides as needed.\n" +
            "4.Once creamy, add salt (or other add-ins) to taste. Then transfer to a clean jar or container and store in the refrigerator up to 3 weeks (sometimes longer).",
            "1.Soak the jowar seeds overnight and boil it in the same water for 15 minutes. (Optional: Boil it with 2 garlic cloves wrapped in a muslin cloth to infuse some flavor.)\n2.Heat the rice bran oil in a pan. Add mustard seeds, curry leaves, green chillies and ginger.\n3.When the seeds splutter, add baby corn, after a minute add the the zucchin. Stir fry.\n4.Add the red peppers and yellow peppers. Stir fry.\n5.Add the salt , pepper & cooked jowar. Toss well.\n6.Garnish with coriander leaves.",
            "For Oats Powder:\n1.Take 2 cups of oats in a pan and dry roast them for about 5 minutes until golden brown.\n2.Let it cool down and then grind to make it a powder.\nFor Fried Mixture:\n1.In a broad pan heat oil over medium flame.\n2.Add mustard seeds to it and let them crackle.\n3.Now add chana and urad Dal, turmeric powder and green chillis. Mix well and saute until light brown.\n4.Add the chopped carrots and coriander leaves. Combine all the ingredients thoroughly along with a pinch of salt and cook for a minute or two.\n5.Let the mixture cool down for few minutes before adding into idli batter.\nFor Idli Batter:\n1.Transfer the prepared oats powder to a large bowl.\n2.In this add salt and the fried mixture. Combine well.\n3.Now add the required quantity of curd and stir thoroughly in one direction adding a pinch of fruit salt to it.\n4.Prepare a medium thick batter and leave it covered for few minutes.\n5.Now grease the idli moulds with ghee using a brush.\n6.Pour the prepared oats idli batter in each mould and put it in the steamer.\n7.Cover with a lid and steam for about 15 minutes over medium flame.\n8.After 15 minutes check whether the idlis are properly cooked.\n9.The tasty and healthy oats idli is ready to serve with coconut chutney."};
    String[] calorie = {"37 Calories", "42 Calories","130 Calories","588 Calories","260 Calories","30 Calories"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        RecipeListItem adapter = new RecipeListItem(RecipeActivity.this, title, imageId, timing, ingerdient, method, calorie);

        list = findViewById(R.id.recipes_list);
        list.setAdapter(adapter);
    }
}