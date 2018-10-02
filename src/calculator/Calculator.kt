package calculator

fun main(args: Array<String>) {

    val rupiah: (Int, Int) -> String = { i1, i2 ->
        var uang: String = Integer.toString(i1 + i2)
        uang = uang.reversed()
        var duit: String? = ""
        for (item in uang.indices) {
            duit = duit + uang[item].toString()
            if ((item+1) % 3 == 0 && item < uang.length-1) duit = duit + "."
        }
        duit = duit?.reversed()
        "Rp $duit"
    }

    hitungTambah(12500, 512500, rupiah)
}

fun hitungTambah(uangA: Int, uangB: Int,
                 rupiah: (Int, Int) -> String) {
    val uang = rupiah(uangA, uangB)
    println(uang)
}

