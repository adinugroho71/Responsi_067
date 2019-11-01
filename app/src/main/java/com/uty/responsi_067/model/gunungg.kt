package com.uty.responsi_067.model

import com.uty.responsi_067.R
object gunungg
    {
    private val gununggName = arrayOf(
        "agung",
        "cartenz",
        "gede",
        "ijen",
        "kerinci",
        "prau",
        "raung",
        "rinjani",
        "semeru",
        "sindoro")

        private val detail= arrayOf(
            "Gunung Agung adalah gunung tertinggi di pulau Bali dengan ketinggian 3.031 mdpl. Gunung ini terletak di kecamatan Rendang, Kabupaten Karangasem, Bali, Indonesia. Pura Besakih, yang merupakan salah satu Pura terpenting di Bali, terletak di lereng gunung ini.",
            "Gunung Cartenz adalah sebuah gunung yang terletak di Papua, Indonesia. Gunung ini memiliki tinggi setinggi 4.884 meter di atas permukaan laut yang diselimuti salju abadi. Puncak gunung ini disebut \"Piramida Cartenz\", dan juga Puncak Jaya, yang merupakan dataran tertinggi di Indonesia. Gunung ini adalah salah satu dari tujuh gunung yang dikenal sebagai Tujuh Puncak Dunia",
            "Gunung Gede merupakan sebuah gunung api bertipe stratovolcano yang berada di Pulau Jawa, Indonesia. Gunung Gede berada dalam ruang lingkup Taman Nasional Gede Pangrango, yang merupakan salah satu dari lima taman nasional yang pertama kali diumumkan di Indonesia pada tahun 1980.Gunung Gede (Aksara Sunda Baku: ᮌᮥᮔᮥᮀ ᮌᮨᮓᮦ, Gunung Gedé) merupakan sebuah gunung api bertipe stratovolcano yang berada di Pulau Jawa, Indonesia. Gunung Gede berada dalam ruang lingkup Taman Nasional Gede Pangrango, yang merupakan salah satu dari lima taman nasional yang pertama kali diumumkan di Indonesia pada tahun 1980.",
            "Gunung Ijen adalah sebuah gunung berapi yang terletak di perbatasan antara Kabupaten Banyuwangi dan Kabupaten Bondowoso, Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.386 mdpl dan terletak berdampingan dengan Gunung Marapi. ",
            "Gunung Kerinci adalah gunung tertinggi di Sumatra, gunung berapi tertinggi di Indonesia, dan puncak tertinggi di Indonesia di luar Papua. Gunung Kerinci terletak di Provinsi Jambi, di Pegunungan Bukit Barisan, dekat pantai barat, dan terletak sekitar 130 km sebelah selatan Padang Provinsi Sumatra Barat.",
            "Gunung Prahu terletak di kawasan Dataran Tinggi Dieng, Jawa Tengah, Indonesia. Gunung Prahu terletak pada koordinat 7°11′13″S 109°55′22″E. Gunung Prahu merupakan tapal batas antara tiga kabupaten yaitu Kabupaten Batang, Kabupaten Kendal dan Kabupaten Wonosobo.",
            "Gunung Raung adalah gunung berapi kerucut yang terletak di ujung timur Pulau Jawa, Indonesia. Secara administratif, kawasan gunung ini termasuk dalam wilayah tiga kabupaten di wilayah Besuki, Jawa Timur, yaitu Banyuwangi, Bondowoso, dan Jember.",
            "Gunung Rinjani adalah gunung yang berlokasi di Pulau Lombok, Nusa Tenggara Barat. Gunung yang merupakan gunung berapi kedua tertinggi di Indonesia dengan ketinggian 3.726 m dpl serta terletak pada lintang 8º25' LS dan 116º28' BT ini merupakan gunung favorit bagi pendaki Indonesia karena keindahan pemandangannya.,",
            "Gunung Semeru atau Gunung Meru adalah sebuah gunung berapi kerucut di Jawa Timur, Indonesia. Gunung Semeru merupakan gunung tertinggi di Pulau Jawa, dengan puncaknya Mahameru, 3.676 meter dari permukaan laut (mdpl). Gunung Semeru juga merupakan gunung berapi tertinggi ketiga di Indonesia setelah Gunung Kerinci di Sumatra dan Gunung Rinjani di Nusa Tenggara Barat.",
            "Gunung Sindoro, biasa disebut Sindara, atau juga Sundoro merupakan sebuah gunung volkano aktif yang terletak di Jawa Tengah, Indonesia, dengan Temanggung sebagai kota terdekat. Gunung Sindoro terletak berdampingan dengan Gunung Sumbing.Gunung sindara dapat terlihat jelas dari puncak sikunir dieng")

        private val poster = intArrayOf(
            R.drawable.agung,
            R.drawable.cartenz,
            R.drawable.gede,
            R.drawable.ijen,
            R.drawable.kerinci,
            R.drawable.prau,
            R.drawable.raung,
            R.drawable.rinjani,
            R.drawable.semeru,
            R.drawable.sindoro)

        val listgunung: ArrayList<gunung>
            get() {
                var list: ArrayList<gunung> = arrayListOf<gunung>()
                for (position: Int in gununggName.indices) {
                    val gunungg = gunung()
                    gunungg.name = gununggName [position]
                    gunungg.detail = detail[position]
                    gunungg.poster = poster[position]
                    list.add(gunungg)
                }
                return list
            }
}
