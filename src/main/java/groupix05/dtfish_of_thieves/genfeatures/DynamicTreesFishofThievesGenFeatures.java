package groupix05.dtfish_of_thieves.genfeatures;

import com.ferreusveritas.dynamictrees.api.registry.Registry;
import com.ferreusveritas.dynamictrees.systems.genfeature.GenFeature;
import groupix05.dtfish_of_thieves.DynamicTreesFishofThieves;

public class DynamicTreesFishofThievesGenFeatures {

    public static final GenFeature BANANA_FRUIT = new BananaFruitGenFeature(DynamicTreesFishofThieves.location("banana_fruit"));
    public static final GenFeature PALM_FRUIT = new PalmFruitGenFeature(DynamicTreesFishofThieves.location("palm_fruit"));

    public static void register(final Registry<GenFeature> registry) {
        registry.registerAll(BANANA_FRUIT, PALM_FRUIT);
    }

}
