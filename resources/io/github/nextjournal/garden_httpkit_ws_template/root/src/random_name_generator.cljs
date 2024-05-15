(ns random-name-generator)

(def adjectives
  ["abundant" "adroit" "agreeable" "ambitious" "ancient" "arcadian" "attractive" "beautiful" "benevolent" "bewildering" "big" "brave" "breezy" "calm" "careful" "celebratory" "charming" "clean" "clever" "colossal" "compassionate" "comely" "cool" "creamy" "crisp" "cuddly" "curved" "dazzling" "deep" "delicious" "delightful" "didactic" "eager" "early" "easy" "efficacious" "effulgent" "elegant" "emphatic" "faithful" "famous" "fancy" "fast" "fastidious" "fierce" "flowery" "fluffy" "fresh" "fulsome" "futuristic" "gentle" "gifted" "gigantic" "glamorous" "gorgeous" "great" "handsome" "happy" "helpful" "hot" "howling" "huge" "immense" "inspirational" "jocular" "jolly" "judicious" "juicy" "kind" "large" "little" "lively" "long" "loose" "loquacious" "luminous" "lyrical" "magnificent" "mannered" "massive" "melodic" "microscopic" "miniature" "muscular" "mysterious" "noisy" "ornate" "parsimonious" "petite" "plump" "polite" "powerful" "prehistoric" "proud" "puckish" "purring" "quaint" "quick" "quiet" "rapid" "raspy" "refined" "rhythmic" "rough" "round" "sagacious" "salty" "salubrious" "savory" "scrawny" "scruffy" "serpentine" "shaggy" "shallow" "shapely" "sharp" "short" "shy" "silly" "small" "sticky" "stocky" "strong" "substantial" "sweet" "swift" "tall" "tangy" "tart" "tasty" "teeny" "tenacious" "tender" "thankful" "thundering" "tinkling" "tiny" "ubiquitous" "vast" "verdant" "victorious" "warm" "whispering" "witty" "wonderful" "wooden" "yummy" "zealous"])

(def nouns
  ;; misc
  ["balloon" "bike" "boots" "camera" "candle" "caravan" "carpet" "crayon" "diamond" "dream" "engine" "flower" "fountain" "ghost" "helicopter" "helmet" "jacket" "jewel" "kite" "lamp" "notebook" "pearl" "rainbow" "rainbow" "raincoat" "robe" "rocket" "ruby" "sailboat" "scooter" "spoon" "stone" "telephone" "train" "trapeze" "umbrella" "vase" "wardrobe"

   ;; locations
   "forest" "island" "lake" "mountain" "nest" "river" "stream" "valley"

   ;; misc foods
   "sandwich" "pizza" "honey" "jelly" "sorbet"

   ;; animals
   "ant" "alligator" "bear" "beaver" "bee" "bird" "capybara" "dog" "elephant" "fish" "hippo" "horse" "jackal" "kangaroo" "mammoth" "monkey" "parrot" "rhino" "tiger" "vulture" "walrus" "whale" "wolf" "yak" "zebra"

   ;; musical instruments
   "bassoon" "cello" "flute" "guitar" "microphone" "piano" "piccolo" "viola" "violin" "ukelele" "xylophone"

   ;; veggies
   "artichoke" "arugula" "asparagus" "aubergine" "basil" "bok choy" "broccoli" "cabbage" "caraway" "carrot" "cauliflower" "celery" "chamomile" "chard" "chives" "coriander" "courgette" "cucumber" "daikon" "dill" "eggplant" "endive" "fennel" "fennel" "fiddleheads" "frisee" "garlic" "ginger" "greens" "herbs" "kale" "kohlrabi" "lavender" "leek" "lentils" "lettuce" "marjoram" "onion" "oregano" "paprika" "parsley" "parsnip" "peanut" "peas" "pepper" "potato" "radish" "rhubarb" "rosemary" "rutabaga" "scallion" "shallot" "spinach" "squash" "thyme" "wasabi" "watercress" "yam"

   ;; fruits
   "apple" "apricot" "avocado" "banana" "bilberry" "blackberry" "blackcurrant" "blueberry" "boysenberry" "breadfruit" "cacao" "cactus" "cantaloupe" "cherry" "chili" "clementine" "cloudberry" "coconut" "cranberry" "currant" "dragonfruit" "durian" "elderberry" "fig" "gooseberry" "grape" "grapefruit" "guava" "guyabano" "honeyberry" "honeydew" "huckleberry" "jackfruit" "jujube" "kiwifruit" "kumquat" "lemon" "lime" "loganberry" "loquat" "lychee" "mandarine" "mango" "melon" "mulberry" "nectarine" "olive" "orange" "papaya" "passionfruit" "pawpaw" "peach" "pear" "persimmon" "pineapple" "pineberry" "plantain" "plum" "pomegranate" "pomelo" "prune" "pumpkin" "quince" "raisin" "raspberry" "redcurrant" "salmonberry" "satsuma" "soursop" "strawberry" "tamarind" "tangerine" "tomato" "watermelon" "yuzu"])

(defn new []
  (let [date (new js/Date)]
    (str (rand-nth adjectives)
         "-"
         (rand-nth nouns)
         "-"
         (+ (.getMinutes date)
            (.getSeconds date)))))
