package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<Recipe> mRecipeList = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private RecipeListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Recipe myRecipe1 = new Recipe("One Pot Thai-Style Rice Noodles",
                "Chicken, vegetables, and noodles prepared in a light tasting but full-flavored Asian-inspired sauce.",
                "Ingredients\n\n" +
                        "2 tablespoons cornstarch\n" +
                        "1 ½ tablespoons water\n" +
                        "6 cups chicken broth\n" +
                        "2 ½ tablespoons soy sauce\n" +
                        "1 tablespoon fish sauce\n" +
                        "1 tablespoon rice vinegar\n" +
                        "1 tablespoon chile-garlic sauce (such as Sriracha®), or more to taste\n" +
                        "2 teaspoons vegetable oil\n" +
                        "2 teaspoons minced fresh ginger root\n" +
                        "2 cloves garlic, minced\n" +
                        "1 teaspoon ground coriander\n" +
                        "1 (16 ounce) package thick rice noodles\n" +
                        "1 cup sliced zucchini\n" +
                        "1 cup sliced red bell pepper\n" +
                        "2 cooked chicken breasts, cut into 1-inch cubes\n" +
                        "¼ cup crushed peanuts (Optional)\n" +
                        "¼ cup chopped fresh cilantro (Optional)\n" +
                        "\nDirections\n\n" +
                        "Step 1\n" +
                        "Stir cornstarch and water together in a small bowl until smooth. Pour chicken broth into a large pot and stir cornstarch mixture, soy sauce, fish sauce, rice vinegar, chile-garlic sauce, vegetable oil, ginger, garlic, and coriander into broth. Cover and bring to a boil.\n" +
                        "\n" +
                        "Step 2\n" +
                        "Place rice noodles in the boiling sauce, reduce heat to medium, and simmer until noodles are tender, 5 to 10 minutes. Stir zucchini, red bell pepper, and chicken into sauce. Bring back to a boil, cover, and simmer until vegetables are just become tender, about 5 more minutes.\n" +
                        "\n" +
                        "Step 3\n" +
                        "Remove from heat and let stand, covered, for 5 minutes to thicken. Serve garnished with crushed peanuts and cilantro.",
                "recipe1");

        Recipe myRecipe2 = new Recipe ("Spatchcock Chicken",
                "Spatchcocking makes for a bird with super crisp skin and moist meat, in about half the time it takes to roast a whole bird.",
                "Ingredients\n\n" +
                        "2 (3 1/2) pound whole chickens, wingtips removed\n" +
                        "2 teaspoons salt\n" +
                        "1 teaspoon dried tarragon\n" +
                        "1 teaspoon paprika\n" +
                        "¼ teaspoon black pepper\n" +
                        "4 teaspoons olive oil\n" +
                        "2 lemons, thinly sliced and seeded\n" +
                        "\nDirections\n\n" +
                        "Step 1\n" +
                        "Preheat oven to 450 degrees F (230 degrees C). Line a large rimmed baking sheet with foil.\n" +
                        "\n" +
                        "Step 2\n" +
                        "Place chicken, breast side down, on a work surface. Starting at the tail end, cut along both sides of backbone with kitchen shears. Remove backbone. Grabbing hold of both sides of the chicken, open it like a book. Turn breast side up. Push down on each side of breast with your hands until you hear it crack. Flatten chicken and transfer to one short end of the prepared baking sheet. Repeat with the second chicken.\n" +
                        "\n" +
                        "Step 3\n" +
                        "Combine salt, tarragon, paprika, and pepper in a small bowl. Stir in oil. Run your fingers under chicken skin and rub tarragon paste under skin. Slide lemon slices under skin, in a single layer.\n" +
                        "\n" +
                        "Step 4\n" +
                        "Roast until skin is crisp and an instant-read thermometer inserted into thickest part of breast reads 165 degrees F, about 35 minutes. Let stand 5 minutes before cutting each chicken into 8 pieces.",
                "recipe2");

        Recipe myRecipe3 = new Recipe ("Skillet Chicken Bulgogi",
                "This is a quick and easy, but very tasty meal. You can substitute the chicken with beef or pork for variety. My wife and I absolutely love this recipe, and it only takes 30 minutes with very few dirty dishes! Serve over rice.",
                "Ingredients\n\n" +
                        "¼ cup chopped onion\n" +
                        "5 tablespoons soy sauce\n" +
                        "2 ½ tablespoons brown sugar\n" +
                        "2 tablespoons minced garlic\n" +
                        "2 tablespoons sesame oil\n" +
                        "1 tablespoon sesame seeds\n" +
                        "½ teaspoon cayenne\n" +
                        "salt and ground black pepper to taste\n" +
                        "1 pound skinless, boneless chicken breasts, cut into thin strips\n" +
                        "\nDirections\n\n" +
                        "Step 1\n" +
                        "Whisk onion, soy sauce, brown sugar, garlic, sesame oil, sesame seeds, cayenne pepper, salt, and black pepper together in a bowl until marinade is smooth.\n" +
                        "\n" +
                        "Step 2\n" +
                        "Cook and stir chicken and marinade together in a large skillet over medium-high heat until chicken is cooked through, about 15 minutes.",
                "recipe3");

        Recipe myRecipe4 = new Recipe("Klupskies (Polish Burgers)",
                "This recipe is a family favorite that was passed down over the generations. Grandma and Pap just ate them plain, with a fork (sometimes dipped in ketchup), but our family likes to top these burgers with cheese and serve on a hamburger bun in a the traditional way. I have also seen these referred to as Kotlety Mielone. These can also be cooked on the grill.",
                "Ingredients\n\n" +
                        "1 pound ground beef\n" +
                        "1 small onion, diced\n" +
                        "½ green pepper, diced\n" +
                        "1 egg\n" +
                        "2 tablespoons ketchup\n" +
                        "¼ teaspoon sea salt\n" +
                        "2 slices white bread, torn into small pieces\n" +
                        "1 serving cooking spray with olive oil\n" +
                        "\nDirections\n\n" +
                        "Step 1\n" +
                        "Mix ground beef, onion, green pepper, egg, ketchup, and sea salt together in a bowl; mix in the white bread pieces until evenly distributed. Form the mixture into 4 patties.\n" +
                        "\n" +
                        "Step 2\n" +
                        "Spray a large skillet with olive oil cooking spray and set over medium heat. Cook the burgers until well-browned on the bottoms, about 10 minutes; flip the burgers and cook until the meat is no longer pink and the juices run clear, 8 to 10 more minutes.",
                "recipe4");

        Recipe myRecipe5 = new Recipe ("Simple Macaroni and Cheese",
                "A very quick and easy fix to a tasty side-dish. Fancy, designer mac and cheese often costs forty or fifty dollars to prepare when you have so many exotic and expensive cheeses, but they aren't always the best tasting. This recipe is cheap and tasty.",
                "Ingredients\n\n" +
                        "1 (8 ounce) box elbow macaroni\n" +
                        "¼ cup butter\n" +
                        "¼ cup all-purpose flour\n" +
                        "½ teaspoon salt\n" +
                        "ground black pepper to taste\n" +
                        "2 cups milk\n" +
                        "2 cups shredded Cheddar cheese\n" +
                        "\nDirections\n\n" +
                        "Step 1\n" +
                        "Bring a large pot of lightly salted water to a boil. Cook elbow macaroni in the boiling water, stirring occasionally until cooked through but firm to the bite, 8 minutes. Drain.\n" +
                        "\n" +
                        "Step 2\n" +
                        "Melt butter in a saucepan over medium heat; stir in flour, salt, and pepper until smooth, about 5 minutes. Slowly pour milk into butter-flour mixture while continuously stirring until mixture is smooth and bubbling, about 5 minutes. Add Cheddar cheese to milk mixture and stir until cheese is melted, 2 to 4 minutes.\n" +
                        "\n" +
                        "Step 3\n" +
                        "Fold macaroni into cheese sauce until coated.",
                "recipe5");


        Recipe myRecipe6 = new Recipe ("Cheesy Vegetarian Enchilada Casserole",
                "Quick and easy cheesy enchilada casserole. Takes only 6 ingredients to make this popular one-pan amazing Mexican vegetarian dinner dish! Garnish with green onions and sour cream if desired.",
                "Ingredients\n\n" +
                        "cooking spray\n" +
                        "10 (6 inch) corn tortillas, cut into quarters\n" +
                        "1 (8 ounce) package sharp Cheddar cheese, cubed\n" +
                        "1 onion, chopped\n" +
                        "1 (3.8 ounce) can sliced black olives\n" +
                        "1 (16 ounce) can green chile enchilada sauce\n" +
                        "2 cups shredded Mexican cheese blend\n" +
                        "\nDirections\n\n" +
                        "Step 1\n" +
                        "Preheat oven to 375 degrees F (190 degrees C). Spray an 8-inch baking dish with cooking spray.\n" +
                        "\n" +
                        "Step 2\n" +
                        "Arrange 1/3 of the tortillas over the bottom of the prepared dish. Spread 1/2 the Cheddar cheese, onion, and olives over tortillas. Spoon 1/3 of the green enchilada sauce and 1/3 of the Mexican cheese on top. Repeat layering with 1/3 tortillas and the remaining Cheddar cheese, onion, and olives. Spoon another third of the sauce and Mexican cheese on top. Finish with the remaining tortillas, sauce, and Mexican cheese. Cover with aluminum foil.\n" +
                        "\n" +
                        "Step 3\n" +
                        "Bake in the preheated oven for 15 minutes. Remove foil and continue baking until cheese is bubbly on top, about 10 minutes more.",
                "recipe6");

        Recipe myRecipe7 = new Recipe("Garlic-Brown Sugar Chicken Thighs",
                "I love the crunchy chicken skin and brown sugar pan sauce that comes out of this.",
                "Ingredients\n\n" +
                        "8 bone-in, skin-on chicken thighs\n" +
                        "salt and ground black pepper to taste\n" +
                        "3 tablespoons unsalted butter, divided\n" +
                        "4 cloves garlic, minced\n" +
                        "¼ cup packed brown sugar\n" +
                        "1 tablespoon honey\n" +
                        "½ teaspoon dried oregano\n" +
                        "¼ teaspoon dried thyme\n" +
                        "¼ teaspoon dried basil\n" +
                        "\nDirections\n\n" +
                        "Step 1\n" +
                        "Preheat the oven to 400 degrees F (200 degrees C).\n" +
                        "\n" +
                        "Step 2\n" +
                        "Season chicken thighs with salt and pepper.\n" +
                        "\n" +
                        "Step 3\n" +
                        "Melt 2 tablespoons butter in a large oven-proof skillet over medium-high heat. Add chicken, skin-side down, and sear until brown, 2 to 3 minutes per side. Remove chicken to a plate.\n" +
                        "\n" +
                        "Step 4\n" +
                        "Melt remaining butter in the skillet. Add garlic; cook and stir until fragrant, 1 to 2 minutes. Remove from heat and stir in brown sugar, honey, oregano, thyme, and basil until well combined. Return chicken to the skillet.\n" +
                        "\n" +
                        "Step 5\n" +
                        "Bake in the preheated oven until chicken is no longer pink at the bone and the juices run clear, 25 to 30 minutes. An instant-read thermometer inserted near the bone should read 165 degrees F (74 degrees C).",
                "recipe7");

        mRecipeList.addLast(myRecipe1);
        mRecipeList.addLast(myRecipe2);
        mRecipeList.addLast(myRecipe3);
        mRecipeList.addLast(myRecipe4);
        mRecipeList.addLast(myRecipe5);
        mRecipeList.addLast(myRecipe6);
        mRecipeList.addLast(myRecipe7);

        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new RecipeListAdapter(this, mRecipeList);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        LinearLayoutManager linear = new LinearLayoutManager(this);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(linear);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, linear.getOrientation());
        mRecyclerView.addItemDecoration(dividerItemDecoration);


    }
}