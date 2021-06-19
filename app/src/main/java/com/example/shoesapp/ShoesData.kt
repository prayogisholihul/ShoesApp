package com.example.shoesapp

object ShoesData {
    private val shoesname = arrayOf(
        "Nike Men's Zoom KD X",
        "Air Jordan 1 Retro High Fearless OG",
        "Nike Air Max 97",
        "Vans Old Skool",
        "Vans Old Skool Flames",
        "Adidas Nmd r1",
        "Adidas Continental 80",
        "Converse All Star Hi Sneaker",
        "Nike Air Force 1",
        "Puma Suede"
    )

    private val shoesDesc = arrayOf(
        "The Nike KD X is made to fit superstar Kevin Durant's versatile game. As a pure shooter, gifted scorer, and dangerous playmaker, Durant needs a shoe that provides the perfect combination of cushioning, lockdown, and fit. The KD X is the latest and greatest in a long line of KD's signature shoes with updated tech and a fresh look that's perfect for the court. Flyknit upper offers breathability, stretch, and support. Dynamic lacing system provides a locked-down fit that moves with your foot. Full-length visible Zoom Air unit provides low-profile, responsive cushioning with every step. Rubber outsole has a multidirectional traction pattern for durability and grip all game long.",
        "Nike pays a new tribute to the famous Jumpman with a Air Jordan 1 Retro High OGFearless unprecedented. This release is part of the collection Fearlessshe salutes a speech given by Michael Jordan 10 years ago at his coronation at the NBA's Hall Of Fame. MJ had stated in it that\" Limits, like fear, are often just an illusion ».",
        "The OG that shook up the running world with its revolutionary full-length Air unit is back in remastered form—and the silhouette is again getting an injection of energy from LA-based sneaker boutique UNDEFEATED. As a continuation of the prior two AM97 colourways that recently launched exclusively at UNDEFEATED, this release features a clean base of neutral white complemented by contrasting highlights of Aero Blue and Midwest Gold.",
        "Vans is an American manufacturer of skateboarding shoes and related apparel, based in Santa Ana, California and owned by VF Corporation. The company also sponsors surf, snowboarding, BMX, and motocross teams.[2] Since 1996, the company has been the primary sponsor of the annual Vans Warped Tour traveling rock festival.",
        "Featuring a timeless flame print, the Flame Old Skool pays homage to our heritage while ensuring that this low top, lace-up shoe remains as iconic as ever. Made with durable suede and canvas uppers, it also includes re-enforced toe caps, supportive padded collars, and signature rubber waffle outsoles.",
        "Absolutely stylish and the front-runner in athletic-inspired street sneaker fashion, adidas presents the NMD R1 in a Zumiez exclusive black, white, red and blue colorway. Taking hints and cues from running shoes of the 1980s, the NMD R1 takes a minimalist approach in aesthetic, while equipped with modern responsive cushioning through the brand's iconic EVA Boost midsole that sports contrasting EVA plugs. Delivering energy return with each stride and composed with a full one-piece bootie construction for a sock-like fit, the NMD R1 is a sneaker with a big personality.",
        "A vegan update to the retro Continental 80 trainers. These men's shoes are made entirely without animal products. They have a leather-like upper with an embossed vegan logo at the heel. The swooping side stripe and logo window keep the look authentic.",
        "Both classic and iconic, the Hi Top Converse Chuck Taylor All Star exhibits timeless high top sneaker style. Whether scribbled or sketched on, roughed up and scuffed from countless concerts and everyday sneaker love, or worn clean to pay homage to Old School hoops, the Converse All Star is what you make it—an authentic lifestyle sneaker with a blank canvas for expression.",
        "The radiance lives on in the Nike Air Force 1 '07, the b-ball OG that puts a fresh spin on what you know best: crisp leather, bold colours and the perfect amount of flash to let you shine.",
" “Genesis of Puma Suede model dates back to 1968, when it was first presented to NBA. It's initial popularity is owed to a player of New York Knicks - Walter \"Clyde\" Frazier. This simple suede design quickly mastered the streets of New York, especially among Hip-Hop, B-boy and Funk people, to finally conquer the whole world! Puma Suede sneakers were one of the favorite shoes of sports and stage stars, and even skaters! It is not surprising that they appeared in many films, of which the most famous is \"Beat Street\" from 1984. Today we are witnesses of the evolution of trends from sports to street style...”."
        )

    private val shoesSize = arrayOf(
        "40,41,42,43,44,45",
        "42,43,44",
        "41,42,44,45,46",
        "40,42,44,55",
        "42,44,45",
        "40,42,45,46",
        "38,39,40,41",
        "40,41,43,44",
        "40,41,42,44",
        "42,44,45"
    )

    private val shoesPrice = doubleArrayOf(
        120.0,
        450.0,
        250.0,
        110.0,
        150.0,
        185.0,
        70.0,
        80.0,
        120.0,
        115.0
    )

    private val shoesPic = intArrayOf(
        R.drawable.nike_shoes,
        R.drawable.air_jordansatu,
        R.drawable.nike_air_max,
        R.drawable.vans,
        R.drawable.vans_flames,
        R.drawable.adidas_nmd_r1,
        R.drawable.adidas_continental,
        R.drawable.converse_hi,
        R.drawable.adidas_air_force,
        R.drawable.puma
    )


    val listData: ArrayList<Shoes>
        get() {
            val list = arrayListOf<Shoes>()
            for (position in shoesname.indices) {
                val shoes = Shoes()
                shoes.name = shoesname[position]
                shoes.desc = shoesDesc[position]
                shoes.size = shoesSize[position]
                shoes.price = shoesPrice[position]
                shoes.pic = shoesPic[position]

                list.add(shoes)
            }
            return list
        }
}