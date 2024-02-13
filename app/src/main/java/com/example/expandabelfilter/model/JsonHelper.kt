package com.example.expandabelfilter.model

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class JsonHelper {

    val json = """
        [
          {
            "key": "brand",
            "name": "Brand",
            "options": [
              {
                "name": "Nike",
                "value": "nike",
                "count": 12637
              },
              {
                "name": "Adidas",
                "value": "adidas",
                "count": 10555
              },
              {
                "name": "Asics",
                "value": "asics",
                "count": 8019
              },
              {
                "name": "Puma",
                "value": "puma",
                "count": 6813
              },
              {
                "name": "Dream Pairs",
                "value": "dream-pairs",
                "count": 3528
              },
              {
                "name": "New Balance",
                "value": "new-balance",
                "count": 2504
              },
              {
                "name": "Skechers",
                "value": "skechers",
                "count": 2251
              },
              {
                "name": "Mlagjss",
                "value": "mlagjss",
                "count": 1797
              },
              {
                "name": "Hey Dude",
                "value": "hey-dude",
                "count": 1612
              },
              {
                "name": "Coutgo",
                "value": "coutgo",
                "count": 1443
              },
              {
                "name": "Dr. Scholl's Shoes",
                "value": "dr-scholl-s-shoes",
                "count": 1227
              },
              {
                "name": "Bruno Marc",
                "value": "bruno-marc",
                "count": 1206
              },
              {
                "name": "Reebok",
                "value": "reebok",
                "count": 1190
              },
              {
                "name": "Stq",
                "value": "stq",
                "count": 1132
              },
              {
                "name": "Ellie Shoes",
                "value": "ellie-shoes",
                "count": 1094
              },
              {
                "name": "Under Armour",
                "value": "under-armour",
                "count": 1031
              },
              {
                "name": "Masbird",
                "value": "masbird",
                "count": 1027
              },
              {
                "name": "Salomon",
                "value": "salomon",
                "count": 1021
              },
              {
                "name": "Clarks",
                "value": "clarks",
                "count": 888
              },
              {
                "name": "Dc",
                "value": "dc",
                "count": 856
              },
              {
                "name": "Uin",
                "value": "uin",
                "count": 854
              },
              {
                "name": "Fila",
                "value": "fila",
                "count": 850
              },
              {
                "name": "Merrell",
                "value": "merrell",
                "count": 838
              },
              {
                "name": "Crocs",
                "value": "crocs",
                "count": 822
              },
              {
                "name": "Qscq",
                "value": "qscq",
                "count": 770
              },
              {
                "name": "Fitville",
                "value": "fitville",
                "count": 760
              },
              {
                "name": "Vans",
                "value": "vans",
                "count": 739
              },
              {
                "name": "Jenn Ardor",
                "value": "jenn-ardor",
                "count": 728
              },
              {
                "name": "Whitin",
                "value": "whitin",
                "count": 722
              },
              {
                "name": "Ecco",
                "value": "ecco",
                "count": 716
              },
              {
                "name": "Hoka One One",
                "value": "hoka-one-one",
                "count": 715
              },
              {
                "name": "Vionic",
                "value": "vionic",
                "count": 704
              },
              {
                "name": "Oiangi",
                "value": "oiangi",
                "count": 698
              },
              {
                "name": "Dadawen",
                "value": "dadawen",
                "count": 630
              },
              {
                "name": "Saucony",
                "value": "saucony",
                "count": 620
              },
              {
                "name": "Aodong",
                "value": "aodong",
                "count": 612
              },
              {
                "name": "Cole Haan",
                "value": "cole-haan",
                "count": 607
              },
              {
                "name": "Jousen",
                "value": "jousen",
                "count": 603
              },
              {
                "name": "Nautica",
                "value": "nautica",
                "count": 587
              },
              {
                "name": "Gibob",
                "value": "gibob",
                "count": 566
              },
              {
                "name": "Santimon",
                "value": "santimon",
                "count": 556
              },
              {
                "name": "Fsj",
                "value": "fsj",
                "count": 553
              },
              {
                "name": "Gibobby",
                "value": "gibobby",
                "count": 547
              },
              {
                "name": "Shibever",
                "value": "shibever",
                "count": 546
              },
              {
                "name": "Adidas Originals",
                "value": "adidas-originals",
                "count": 536
              },
              {
                "name": "Keen",
                "value": "keen",
                "count": 527
              },
              {
                "name": "Ydn",
                "value": "ydn",
                "count": 523
              },
              {
                "name": "Calto",
                "value": "calto",
                "count": 521
              },
              {
                "name": "Wayderns",
                "value": "wayderns",
                "count": 519
              },
              {
                "name": "Jeurot",
                "value": "jeurot",
                "count": 516
              },
              {
                "name": "Nortiv 8",
                "value": "nortiv-8",
                "count": 515
              },
              {
                "name": "Toms",
                "value": "toms",
                "count": 510
              },
              {
                "name": "Xero Shoes",
                "value": "xero-shoes",
                "count": 510
              },
              {
                "name": "Larnmern",
                "value": "larnmern",
                "count": 507
              },
              {
                "name": "Akk",
                "value": "akk",
                "count": 504
              },
              {
                "name": "C.paravano",
                "value": "c-paravano",
                "count": 503
              },
              {
                "name": "Columbia",
                "value": "columbia",
                "count": 502
              },
              {
                "name": "Shoes For Crews",
                "value": "shoes-for-crews",
                "count": 501
              },
              {
                "name": "Jwsvbf",
                "value": "jwsvbf",
                "count": 498
              },
              {
                "name": "Converse",
                "value": "converse",
                "count": 494
              },
              {
                "name": "Cape Robbin",
                "value": "cape-robbin",
                "count": 493
              },
              {
                "name": "Ladmiple",
                "value": "ladmiple",
                "count": 485
              },
              {
                "name": "Footjoy",
                "value": "footjoy",
                "count": 484
              },
              {
                "name": "Synia",
                "value": "synia",
                "count": 481
              },
              {
                "name": "Orthocomfoot",
                "value": "orthocomfoot",
                "count": 472
              },
              {
                "name": "Sperry",
                "value": "sperry",
                "count": 472
              },
              {
                "name": "Idifu",
                "value": "idifu",
                "count": 471
              },
              {
                "name": "Geox",
                "value": "geox",
                "count": 464
              },
              {
                "name": "Prop T",
                "value": "propet",
                "count": 455
              },
              {
                "name": "And1",
                "value": "and1",
                "count": 451
              },
              {
                "name": "Bblulu",
                "value": "bblulu",
                "count": 451
              },
              {
                "name": "Yodeks",
                "value": "yodeks",
                "count": 451
              },
              {
                "name": "Brooks",
                "value": "brooks",
                "count": 447
              },
              {
                "name": "Musshoe",
                "value": "musshoe",
                "count": 444
              },
              {
                "name": "Jordan",
                "value": "jordan",
                "count": 442
              },
              {
                "name": "Native Shoes",
                "value": "native-shoes",
                "count": 442
              },
              {
                "name": "Avia",
                "value": "avia",
                "count": 441
              },
              {
                "name": "Soda",
                "value": "soda",
                "count": 438
              },
              {
                "name": "Diadora",
                "value": "diadora",
                "count": 426
              },
              {
                "name": "Tommy Hilfiger",
                "value": "tommy-hilfiger",
                "count": 425
              },
              {
                "name": "Tinacus",
                "value": "tinacus",
                "count": 415
              },
              {
                "name": "Disney",
                "value": "disney",
                "count": 398
              },
              {
                "name": "Mishansha",
                "value": "mishansha",
                "count": 396
              },
              {
                "name": "Lacoste",
                "value": "lacoste",
                "count": 395
              },
              {
                "name": "Xyd",
                "value": "xyd",
                "count": 392
              },
              {
                "name": "Steve Madden",
                "value": "steve-madden",
                "count": 384
              },
              {
                "name": "Usyfakgh",
                "value": "usyfakgh",
                "count": 382
              },
              {
                "name": "Bmcitybm",
                "value": "bmcitybm",
                "count": 375
              },
              {
                "name": "Mettesally",
                "value": "mettesally",
                "count": 373
              },
              {
                "name": "Dream Pairs",
                "value": "dream-pairs",
                "count": 367
              },
              {
                "name": "Mizuno",
                "value": "mizuno",
                "count": 366
              },
              {
                "name": "Gibob Womens Sandals",
                "value": "gibob-womens-sandals",
                "count": 359
              },
              {
                "name": "Lazzy",
                "value": "lazzy",
                "count": 348
              },
              {
                "name": "Foco",
                "value": "foco",
                "count": 346
              },
              {
                "name": "Aachcol",
                "value": "aachcol",
                "count": 345
              },
              {
                "name": "Lucky Step",
                "value": "lucky-step",
                "count": 345
              },
              {
                "name": "Govicta",
                "value": "govicta",
                "count": 343
              },
              {
                "name": "Cybling",
                "value": "cybling",
                "count": 339
              },
              {
                "name": "Michael Kors",
                "value": "michael-kors",
                "count": 337
              }
            ]
          },
          {
            "key": "node_id",
            "name": "Categories",
            "options": [
              {
                "name": "Clothing, Shoes & Jewelry",
                "level": "level1",
                "count": 235593,
                "child": [
                  {
                    "name": "Women",
                    "level": "level2",
                    "count": 103808,
                    "child": [
                      {
                        "name": "Shoes",
                        "level": "level3",
                        "count": 100157,
                        "child": [
                          
                        ],
                        "parent_node_id": "7147440011",
                        "value": "679337011"
                      }
                    ],
                    "parent_node_id": "7141123011",
                    "value": "7147440011"
                  },
                  {
                    "name": "Men",
                    "level": "level2",
                    "count": 86150,
                    "child": [
                      {
                        "name": "Shoes",
                        "level": "level3",
                        "count": 79297,
                        "child": [
                          
                        ],
                        "parent_node_id": "7147441011",
                        "value": "679255011"
                      }
                    ],
                    "parent_node_id": "7141123011",
                    "value": "7147441011"
                  }
                ],
                "value": "7141123011"
              },
              {
                "name": "Sports & Outdoors",
                "level": "level1",
                "count": 6407,
                "child": [
                  
                ],
                "value": "3375251"
              }
            ]
          },
          {
            "key": "custom_filter",
            "name": "Custom Filter ",
            "options": [
              {
                "name": "gender",
                "key": 25,
                "child": [
                  {
                    "key": "unisex",
                    "value": "unisex",
                    "count": 0
                  },
                  {
                    "key": "female",
                    "value": "female",
                    "count": 0
                  }
                ]
              },
              {
                "name": "color",
                "key": 100001,
                "child": [
                  {
                    "key": "camo",
                    "value": "camo",
                    "count": 0
                  },
                  {
                    "key": "white",
                    "value": "white",
                    "count": 0
                  },
                  {
                    "key": "black",
                    "value": "black",
                    "count": 0
                  },
                  {
                    "key": "beige",
                    "value": "beige",
                    "count": 0
                  },
                  {
                    "key": "gold",
                    "value": "gold",
                    "count": 0
                  },
                  {
                    "key": "khaki",
                    "value": "khaki",
                    "count": 0
                  },
                  {
                    "key": "red",
                    "value": "red",
                    "count": 0
                  },
                  {
                    "key": "white silver",
                    "value": "white silver",
                    "count": 0
                  },
                  {
                    "key": "as shown",
                    "value": "as shown",
                    "count": 0
                  },
                  {
                    "key": "black flash wheel",
                    "value": "black flash wheel",
                    "count": 0
                  },
                  {
                    "key": "navy",
                    "value": "navy",
                    "count": 0
                  },
                  {
                    "key": "blue",
                    "value": "blue",
                    "count": 0
                  },
                  {
                    "key": "green",
                    "value": "green",
                    "count": 0
                  },
                  {
                    "key": "natural",
                    "value": "natural",
                    "count": 0
                  },
                  {
                    "key": "grey",
                    "value": "grey",
                    "count": 0
                  },
                  {
                    "key": "multi",
                    "value": "multi",
                    "count": 0
                  },
                  {
                    "key": "multicolor",
                    "value": "multicolor",
                    "count": 0
                  },
                  {
                    "key": "orange",
                    "value": "orange",
                    "count": 0
                  },
                  {
                    "key": "clear",
                    "value": "clear",
                    "count": 0
                  },
                  {
                    "key": "style",
                    "value": "style",
                    "count": 0
                  },
                  {
                    "key": "pink",
                    "value": "pink",
                    "count": 0
                  },
                  {
                    "key": "silver",
                    "value": "silver",
                    "count": 0
                  },
                  {
                    "key": "assorted color",
                    "value": "assorted color",
                    "count": 0
                  },
                  {
                    "key": "rustic brown",
                    "value": "rustic brown",
                    "count": 0
                  },
                  {
                    "key": "yellow",
                    "value": "yellow",
                    "count": 0
                  },
                  {
                    "key": "a",
                    "value": "a",
                    "count": 0
                  },
                  {
                    "key": "gray",
                    "value": "gray",
                    "count": 0
                  },
                  {
                    "key": "transparent",
                    "value": "transparent",
                    "count": 0
                  },
                  {
                    "key": "brown",
                    "value": "brown",
                    "count": 0
                  },
                  {
                    "key": "black wheel",
                    "value": "black wheel",
                    "count": 0
                  },
                  {
                    "key": "purple",
                    "value": "purple",
                    "count": 0
                  },
                  {
                    "key": "team color",
                    "value": "team color",
                    "count": 0
                  }
                ]
              }
            ]
          }
        ]
    """.trimIndent()

    val typeToken = object : TypeToken<Filters>() {}.type

    val filterJsonArray = Gson().fromJson<Filters>(json, typeToken)

}