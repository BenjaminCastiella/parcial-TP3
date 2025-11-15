package com.example.parcialtp3_2.code_behind

enum class IconBoxes(
    private val color: Long,
    private val iconColor: Long,
    private val iconSize: Int,
    private val boxWidth: Int,
    private val boxHeight: Int,
    private val boxRoundVal: Int
) {
    CHECK(0x00000, 0XFF093030, 40, 30, 30, 2),
    LIGHT_GREEN(0xFFDFF7E2,0xFF093030,22, 37, 37,15 ),
    DARK_BLUE(0xFF0068FF, 0xFFFFFFFF, 30, 55, 50, 25),
    MID_BLUE(0xFF3299FF, 0xFFFFFFFF, 30, 55, 50, 25),
    LIGHT_BLUE(0Xff6DB6FE, 0xFFFFFFFF, 30, 55, 50, 25),
    DARK_BLUE_SMALL(0xFF0068FF, 0xFFFFFFFF, 30, 57, 57, 20),
    MID_BLUE_SMALL(0xFF3299FF, 0xFFFFFFFF, 30, 57, 57, 20),
    LIGHT_BLUE_SMALL(0Xff6DB6FE, 0xFFFFFFFF, 30, 57, 57, 20),
    GREEN(0XFF00D09E, 0xFFDFF7E2, 22, 37, 37, 15),

    GREEN_GRANDE(0XFF00D09E, 0xFFDFF7E2, 130, 170, 170, 170),
    GREEN_MUY_GRANDE(0XFF00D09E, 0xFFDFF7E2, 130, 200, 200, 150),
    FOTO_EDIT(0XFF00D09E,0XFF093030 ,15,25,25,15),
    FLECHA_BLANCA(0xFFF1FFF3,0XFF093030,15,15,15,15);
    fun getColor(): Long {
        return this.color
    }
    fun getIconColor(): Long {
        return this.iconColor
    }
    fun getIconSize(): Int {
        return this.iconSize
    }
    fun getBoxWidth(): Int {
        return this.boxWidth
    }
    fun getBoxHeight(): Int {
        return this.boxHeight
    }
    fun getBoxRoundVal(): Int {
        return this.boxRoundVal
    }
}