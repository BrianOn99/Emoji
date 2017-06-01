package com.vanniktech.emoji.twitter.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.twitter.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class SymbolsCategory implements EmojiCategory {
  private static final Emoji[] DATA = new Emoji[] {
    new Emoji(0x2764, R.drawable.emoji_twitter_2764),
    new Emoji(0x1f49b, R.drawable.emoji_twitter_1f49b),
    new Emoji(0x1f49a, R.drawable.emoji_twitter_1f49a),
    new Emoji(0x1f499, R.drawable.emoji_twitter_1f499),
    new Emoji(0x1f49c, R.drawable.emoji_twitter_1f49c),
    new Emoji(0x1f5a4, R.drawable.emoji_twitter_1f5a4),
    new Emoji(0x1f494, R.drawable.emoji_twitter_1f494),
    new Emoji(0x2763, R.drawable.emoji_twitter_2763),
    new Emoji(0x1f495, R.drawable.emoji_twitter_1f495),
    new Emoji(0x1f49e, R.drawable.emoji_twitter_1f49e),
    new Emoji(0x1f493, R.drawable.emoji_twitter_1f493),
    new Emoji(0x1f497, R.drawable.emoji_twitter_1f497),
    new Emoji(0x1f496, R.drawable.emoji_twitter_1f496),
    new Emoji(0x1f498, R.drawable.emoji_twitter_1f498),
    new Emoji(0x1f49d, R.drawable.emoji_twitter_1f49d),
    new Emoji(0x1f49f, R.drawable.emoji_twitter_1f49f),
    new Emoji(0x262e, R.drawable.emoji_twitter_262e),
    new Emoji(0x271d, R.drawable.emoji_twitter_271d),
    new Emoji(0x262a, R.drawable.emoji_twitter_262a),
    new Emoji(0x1f549, R.drawable.emoji_twitter_1f549),
    new Emoji(0x2638, R.drawable.emoji_twitter_2638),
    new Emoji(0x2721, R.drawable.emoji_twitter_2721),
    new Emoji(0x1f52f, R.drawable.emoji_twitter_1f52f),
    new Emoji(0x1f54e, R.drawable.emoji_twitter_1f54e),
    new Emoji(0x262f, R.drawable.emoji_twitter_262f),
    new Emoji(0x2626, R.drawable.emoji_twitter_2626),
    new Emoji(0x1f6d0, R.drawable.emoji_twitter_1f6d0),
    new Emoji(0x26ce, R.drawable.emoji_twitter_26ce),
    new Emoji(0x2648, R.drawable.emoji_twitter_2648),
    new Emoji(0x2649, R.drawable.emoji_twitter_2649),
    new Emoji(0x264a, R.drawable.emoji_twitter_264a),
    new Emoji(0x264b, R.drawable.emoji_twitter_264b),
    new Emoji(0x264c, R.drawable.emoji_twitter_264c),
    new Emoji(0x264d, R.drawable.emoji_twitter_264d),
    new Emoji(0x264e, R.drawable.emoji_twitter_264e),
    new Emoji(0x264f, R.drawable.emoji_twitter_264f),
    new Emoji(0x2650, R.drawable.emoji_twitter_2650),
    new Emoji(0x2651, R.drawable.emoji_twitter_2651),
    new Emoji(0x2652, R.drawable.emoji_twitter_2652),
    new Emoji(0x2653, R.drawable.emoji_twitter_2653),
    new Emoji(0x1f194, R.drawable.emoji_twitter_1f194),
    new Emoji(0x269b, R.drawable.emoji_twitter_269b),
    new Emoji(0x1f251, R.drawable.emoji_twitter_1f251),
    new Emoji(0x2622, R.drawable.emoji_twitter_2622),
    new Emoji(0x2623, R.drawable.emoji_twitter_2623),
    new Emoji(0x1f4f4, R.drawable.emoji_twitter_1f4f4),
    new Emoji(0x1f4f3, R.drawable.emoji_twitter_1f4f3),
    new Emoji(0x1f236, R.drawable.emoji_twitter_1f236),
    new Emoji(0x1f21a, R.drawable.emoji_twitter_1f21a),
    new Emoji(0x1f238, R.drawable.emoji_twitter_1f238),
    new Emoji(0x1f23a, R.drawable.emoji_twitter_1f23a),
    new Emoji(0x1f237, R.drawable.emoji_twitter_1f237),
    new Emoji(0x2734, R.drawable.emoji_twitter_2734),
    new Emoji(0x1f19a, R.drawable.emoji_twitter_1f19a),
    new Emoji(0x1f4ae, R.drawable.emoji_twitter_1f4ae),
    new Emoji(0x1f250, R.drawable.emoji_twitter_1f250),
    new Emoji(0x3299, R.drawable.emoji_twitter_3299),
    new Emoji(0x3297, R.drawable.emoji_twitter_3297),
    new Emoji(0x1f234, R.drawable.emoji_twitter_1f234),
    new Emoji(0x1f235, R.drawable.emoji_twitter_1f235),
    new Emoji(0x1f239, R.drawable.emoji_twitter_1f239),
    new Emoji(0x1f232, R.drawable.emoji_twitter_1f232),
    new Emoji(0x1f170, R.drawable.emoji_twitter_1f170),
    new Emoji(0x1f171, R.drawable.emoji_twitter_1f171),
    new Emoji(0x1f18e, R.drawable.emoji_twitter_1f18e),
    new Emoji(0x1f191, R.drawable.emoji_twitter_1f191),
    new Emoji(0x1f17e, R.drawable.emoji_twitter_1f17e),
    new Emoji(0x1f198, R.drawable.emoji_twitter_1f198),
    new Emoji(0x274c, R.drawable.emoji_twitter_274c),
    new Emoji(0x2b55, R.drawable.emoji_twitter_2b55),
    new Emoji(0x1f6d1, R.drawable.emoji_twitter_1f6d1),
    new Emoji(0x26d4, R.drawable.emoji_twitter_26d4),
    new Emoji(0x1f4db, R.drawable.emoji_twitter_1f4db),
    new Emoji(0x1f6ab, R.drawable.emoji_twitter_1f6ab),
    new Emoji(0x1f4af, R.drawable.emoji_twitter_1f4af),
    new Emoji(0x1f4a2, R.drawable.emoji_twitter_1f4a2),
    new Emoji(0x2668, R.drawable.emoji_twitter_2668),
    new Emoji(0x1f6b7, R.drawable.emoji_twitter_1f6b7),
    new Emoji(0x1f6af, R.drawable.emoji_twitter_1f6af),
    new Emoji(0x1f6b3, R.drawable.emoji_twitter_1f6b3),
    new Emoji(0x1f6b1, R.drawable.emoji_twitter_1f6b1),
    new Emoji(0x1f51e, R.drawable.emoji_twitter_1f51e),
    new Emoji(0x1f4f5, R.drawable.emoji_twitter_1f4f5),
    new Emoji(0x1f6ad, R.drawable.emoji_twitter_1f6ad),
    new Emoji(0x2757, R.drawable.emoji_twitter_2757),
    new Emoji(0x2755, R.drawable.emoji_twitter_2755),
    new Emoji(0x2753, R.drawable.emoji_twitter_2753),
    new Emoji(0x2754, R.drawable.emoji_twitter_2754),
    new Emoji(0x203c, R.drawable.emoji_twitter_203c),
    new Emoji(0x2049, R.drawable.emoji_twitter_2049),
    new Emoji(0x1f505, R.drawable.emoji_twitter_1f505),
    new Emoji(0x1f506, R.drawable.emoji_twitter_1f506),
    new Emoji(0x303d, R.drawable.emoji_twitter_303d),
    new Emoji(0x26a0, R.drawable.emoji_twitter_26a0),
    new Emoji(0x1f6b8, R.drawable.emoji_twitter_1f6b8),
    new Emoji(0x1f531, R.drawable.emoji_twitter_1f531),
    new Emoji(0x269c, R.drawable.emoji_twitter_269c),
    new Emoji(0x1f530, R.drawable.emoji_twitter_1f530),
    new Emoji(0x267b, R.drawable.emoji_twitter_267b),
    new Emoji(0x2705, R.drawable.emoji_twitter_2705),
    new Emoji(0x1f22f, R.drawable.emoji_twitter_1f22f),
    new Emoji(0x1f4b9, R.drawable.emoji_twitter_1f4b9),
    new Emoji(0x2747, R.drawable.emoji_twitter_2747),
    new Emoji(0x2733, R.drawable.emoji_twitter_2733),
    new Emoji(0x274e, R.drawable.emoji_twitter_274e),
    new Emoji(0x1f310, R.drawable.emoji_twitter_1f310),
    new Emoji(0x1f4a0, R.drawable.emoji_twitter_1f4a0),
    new Emoji(0x24c2, R.drawable.emoji_twitter_24c2),
    new Emoji(0x1f300, R.drawable.emoji_twitter_1f300),
    new Emoji(0x1f4a4, R.drawable.emoji_twitter_1f4a4),
    new Emoji(0x1f3e7, R.drawable.emoji_twitter_1f3e7),
    new Emoji(0x1f6be, R.drawable.emoji_twitter_1f6be),
    new Emoji(0x267f, R.drawable.emoji_twitter_267f),
    new Emoji(0x1f17f, R.drawable.emoji_twitter_1f17f),
    new Emoji(0x1f233, R.drawable.emoji_twitter_1f233),
    new Emoji(0x1f202, R.drawable.emoji_twitter_1f202),
    new Emoji(0x1f6c2, R.drawable.emoji_twitter_1f6c2),
    new Emoji(0x1f6c3, R.drawable.emoji_twitter_1f6c3),
    new Emoji(0x1f6c4, R.drawable.emoji_twitter_1f6c4),
    new Emoji(0x1f6c5, R.drawable.emoji_twitter_1f6c5),
    new Emoji(0x1f6b9, R.drawable.emoji_twitter_1f6b9),
    new Emoji(0x1f6ba, R.drawable.emoji_twitter_1f6ba),
    new Emoji(0x1f6bc, R.drawable.emoji_twitter_1f6bc),
    new Emoji(0x1f6bb, R.drawable.emoji_twitter_1f6bb),
    new Emoji(0x1f6ae, R.drawable.emoji_twitter_1f6ae),
    new Emoji(0x1f3a6, R.drawable.emoji_twitter_1f3a6),
    new Emoji(0x1f4f6, R.drawable.emoji_twitter_1f4f6),
    new Emoji(0x1f201, R.drawable.emoji_twitter_1f201),
    new Emoji(0x1f523, R.drawable.emoji_twitter_1f523),
    new Emoji(0x2139, R.drawable.emoji_twitter_2139),
    new Emoji(0x1f524, R.drawable.emoji_twitter_1f524),
    new Emoji(0x1f521, R.drawable.emoji_twitter_1f521),
    new Emoji(0x1f520, R.drawable.emoji_twitter_1f520),
    new Emoji(0x1f196, R.drawable.emoji_twitter_1f196),
    new Emoji(0x1f197, R.drawable.emoji_twitter_1f197),
    new Emoji(0x1f199, R.drawable.emoji_twitter_1f199),
    new Emoji(0x1f192, R.drawable.emoji_twitter_1f192),
    new Emoji(0x1f195, R.drawable.emoji_twitter_1f195),
    new Emoji(0x1f193, R.drawable.emoji_twitter_1f193),
    new Emoji(new int[] { 0x0030, 0xfe0f, 0x20e3 }, R.drawable.emoji_twitter_0030_fe0f_20e3),
    new Emoji(new int[] { 0x0031, 0xfe0f, 0x20e3 }, R.drawable.emoji_twitter_0031_fe0f_20e3),
    new Emoji(new int[] { 0x0032, 0xfe0f, 0x20e3 }, R.drawable.emoji_twitter_0032_fe0f_20e3),
    new Emoji(new int[] { 0x0033, 0xfe0f, 0x20e3 }, R.drawable.emoji_twitter_0033_fe0f_20e3),
    new Emoji(new int[] { 0x0034, 0xfe0f, 0x20e3 }, R.drawable.emoji_twitter_0034_fe0f_20e3),
    new Emoji(new int[] { 0x0035, 0xfe0f, 0x20e3 }, R.drawable.emoji_twitter_0035_fe0f_20e3),
    new Emoji(new int[] { 0x0036, 0xfe0f, 0x20e3 }, R.drawable.emoji_twitter_0036_fe0f_20e3),
    new Emoji(new int[] { 0x0037, 0xfe0f, 0x20e3 }, R.drawable.emoji_twitter_0037_fe0f_20e3),
    new Emoji(new int[] { 0x0038, 0xfe0f, 0x20e3 }, R.drawable.emoji_twitter_0038_fe0f_20e3),
    new Emoji(new int[] { 0x0039, 0xfe0f, 0x20e3 }, R.drawable.emoji_twitter_0039_fe0f_20e3),
    new Emoji(0x1f51f, R.drawable.emoji_twitter_1f51f),
    new Emoji(0x1f522, R.drawable.emoji_twitter_1f522),
    new Emoji(new int[] { 0x0023, 0xfe0f, 0x20e3 }, R.drawable.emoji_twitter_0023_fe0f_20e3),
    new Emoji(new int[] { 0x002a, 0xfe0f, 0x20e3 }, R.drawable.emoji_twitter_002a_fe0f_20e3),
    new Emoji(0x25b6, R.drawable.emoji_twitter_25b6),
    new Emoji(0x23f8, R.drawable.emoji_twitter_23f8),
    new Emoji(0x23ef, R.drawable.emoji_twitter_23ef),
    new Emoji(0x23f9, R.drawable.emoji_twitter_23f9),
    new Emoji(0x23fa, R.drawable.emoji_twitter_23fa),
    new Emoji(0x23cf, R.drawable.emoji_twitter_23cf),
    new Emoji(0x23ed, R.drawable.emoji_twitter_23ed),
    new Emoji(0x23ee, R.drawable.emoji_twitter_23ee),
    new Emoji(0x23e9, R.drawable.emoji_twitter_23e9),
    new Emoji(0x23ea, R.drawable.emoji_twitter_23ea),
    new Emoji(0x23eb, R.drawable.emoji_twitter_23eb),
    new Emoji(0x23ec, R.drawable.emoji_twitter_23ec),
    new Emoji(0x25c0, R.drawable.emoji_twitter_25c0),
    new Emoji(0x1f53c, R.drawable.emoji_twitter_1f53c),
    new Emoji(0x1f53d, R.drawable.emoji_twitter_1f53d),
    new Emoji(0x27a1, R.drawable.emoji_twitter_27a1),
    new Emoji(0x2b05, R.drawable.emoji_twitter_2b05),
    new Emoji(0x2b06, R.drawable.emoji_twitter_2b06),
    new Emoji(0x2b07, R.drawable.emoji_twitter_2b07),
    new Emoji(0x2197, R.drawable.emoji_twitter_2197),
    new Emoji(0x2198, R.drawable.emoji_twitter_2198),
    new Emoji(0x2199, R.drawable.emoji_twitter_2199),
    new Emoji(0x2196, R.drawable.emoji_twitter_2196),
    new Emoji(0x2195, R.drawable.emoji_twitter_2195),
    new Emoji(0x2194, R.drawable.emoji_twitter_2194),
    new Emoji(0x21aa, R.drawable.emoji_twitter_21aa),
    new Emoji(0x21a9, R.drawable.emoji_twitter_21a9),
    new Emoji(0x2934, R.drawable.emoji_twitter_2934),
    new Emoji(0x2935, R.drawable.emoji_twitter_2935),
    new Emoji(0x1f500, R.drawable.emoji_twitter_1f500),
    new Emoji(0x1f501, R.drawable.emoji_twitter_1f501),
    new Emoji(0x1f502, R.drawable.emoji_twitter_1f502),
    new Emoji(0x1f504, R.drawable.emoji_twitter_1f504),
    new Emoji(0x1f503, R.drawable.emoji_twitter_1f503),
    new Emoji(0x1f3b5, R.drawable.emoji_twitter_1f3b5),
    new Emoji(0x1f3b6, R.drawable.emoji_twitter_1f3b6),
    new Emoji(0x2795, R.drawable.emoji_twitter_2795),
    new Emoji(0x2796, R.drawable.emoji_twitter_2796),
    new Emoji(0x2797, R.drawable.emoji_twitter_2797),
    new Emoji(0x2716, R.drawable.emoji_twitter_2716),
    new Emoji(0x1f4b2, R.drawable.emoji_twitter_1f4b2),
    new Emoji(0x1f4b1, R.drawable.emoji_twitter_1f4b1),
    new Emoji(0x2122, R.drawable.emoji_twitter_2122),
    new Emoji(0x00a9, R.drawable.emoji_twitter_00a9),
    new Emoji(0x00ae, R.drawable.emoji_twitter_00ae),
    new Emoji(0x3030, R.drawable.emoji_twitter_3030),
    new Emoji(0x27b0, R.drawable.emoji_twitter_27b0),
    new Emoji(0x27bf, R.drawable.emoji_twitter_27bf),
    new Emoji(0x1f51a, R.drawable.emoji_twitter_1f51a),
    new Emoji(0x1f519, R.drawable.emoji_twitter_1f519),
    new Emoji(0x1f51b, R.drawable.emoji_twitter_1f51b),
    new Emoji(0x1f51d, R.drawable.emoji_twitter_1f51d),
    new Emoji(0x1f51c, R.drawable.emoji_twitter_1f51c),
    new Emoji(0x2714, R.drawable.emoji_twitter_2714),
    new Emoji(0x2611, R.drawable.emoji_twitter_2611),
    new Emoji(0x1f518, R.drawable.emoji_twitter_1f518),
    new Emoji(0x26aa, R.drawable.emoji_twitter_26aa),
    new Emoji(0x26ab, R.drawable.emoji_twitter_26ab),
    new Emoji(0x1f534, R.drawable.emoji_twitter_1f534),
    new Emoji(0x1f535, R.drawable.emoji_twitter_1f535),
    new Emoji(0x1f53a, R.drawable.emoji_twitter_1f53a),
    new Emoji(0x1f53b, R.drawable.emoji_twitter_1f53b),
    new Emoji(0x1f538, R.drawable.emoji_twitter_1f538),
    new Emoji(0x1f539, R.drawable.emoji_twitter_1f539),
    new Emoji(0x1f536, R.drawable.emoji_twitter_1f536),
    new Emoji(0x1f537, R.drawable.emoji_twitter_1f537),
    new Emoji(0x1f533, R.drawable.emoji_twitter_1f533),
    new Emoji(0x1f532, R.drawable.emoji_twitter_1f532),
    new Emoji(0x25aa, R.drawable.emoji_twitter_25aa),
    new Emoji(0x25ab, R.drawable.emoji_twitter_25ab),
    new Emoji(0x25fe, R.drawable.emoji_twitter_25fe),
    new Emoji(0x25fd, R.drawable.emoji_twitter_25fd),
    new Emoji(0x25fc, R.drawable.emoji_twitter_25fc),
    new Emoji(0x25fb, R.drawable.emoji_twitter_25fb),
    new Emoji(0x2b1b, R.drawable.emoji_twitter_2b1b),
    new Emoji(0x2b1c, R.drawable.emoji_twitter_2b1c),
    new Emoji(0x1f508, R.drawable.emoji_twitter_1f508),
    new Emoji(0x1f507, R.drawable.emoji_twitter_1f507),
    new Emoji(0x1f509, R.drawable.emoji_twitter_1f509),
    new Emoji(0x1f50a, R.drawable.emoji_twitter_1f50a),
    new Emoji(0x1f514, R.drawable.emoji_twitter_1f514),
    new Emoji(0x1f515, R.drawable.emoji_twitter_1f515),
    new Emoji(0x1f4e3, R.drawable.emoji_twitter_1f4e3),
    new Emoji(0x1f4e2, R.drawable.emoji_twitter_1f4e2),
    new Emoji(0x1f5e8, R.drawable.emoji_twitter_1f5e8),
    new Emoji(new int[] { 0x1f441, 0xfe0f, 0x200d, 0x1f5e8, 0xfe0f }, R.drawable.emoji_twitter_1f441_fe0f_200d_1f5e8_fe0f),
    new Emoji(0x1f4ac, R.drawable.emoji_twitter_1f4ac),
    new Emoji(0x1f4ad, R.drawable.emoji_twitter_1f4ad),
    new Emoji(0x1f5ef, R.drawable.emoji_twitter_1f5ef),
    new Emoji(0x2660, R.drawable.emoji_twitter_2660),
    new Emoji(0x2663, R.drawable.emoji_twitter_2663),
    new Emoji(0x2665, R.drawable.emoji_twitter_2665),
    new Emoji(0x2666, R.drawable.emoji_twitter_2666),
    new Emoji(0x1f0cf, R.drawable.emoji_twitter_1f0cf),
    new Emoji(0x1f3b4, R.drawable.emoji_twitter_1f3b4),
    new Emoji(0x1f004, R.drawable.emoji_twitter_1f004),
    new Emoji(0x1f550, R.drawable.emoji_twitter_1f550),
    new Emoji(0x1f551, R.drawable.emoji_twitter_1f551),
    new Emoji(0x1f552, R.drawable.emoji_twitter_1f552),
    new Emoji(0x1f553, R.drawable.emoji_twitter_1f553),
    new Emoji(0x1f554, R.drawable.emoji_twitter_1f554),
    new Emoji(0x1f555, R.drawable.emoji_twitter_1f555),
    new Emoji(0x1f556, R.drawable.emoji_twitter_1f556),
    new Emoji(0x1f557, R.drawable.emoji_twitter_1f557),
    new Emoji(0x1f558, R.drawable.emoji_twitter_1f558),
    new Emoji(0x1f559, R.drawable.emoji_twitter_1f559),
    new Emoji(0x1f55a, R.drawable.emoji_twitter_1f55a),
    new Emoji(0x1f55b, R.drawable.emoji_twitter_1f55b),
    new Emoji(0x1f55c, R.drawable.emoji_twitter_1f55c),
    new Emoji(0x1f55d, R.drawable.emoji_twitter_1f55d),
    new Emoji(0x1f55e, R.drawable.emoji_twitter_1f55e),
    new Emoji(0x1f55f, R.drawable.emoji_twitter_1f55f),
    new Emoji(0x1f560, R.drawable.emoji_twitter_1f560),
    new Emoji(0x1f561, R.drawable.emoji_twitter_1f561),
    new Emoji(0x1f562, R.drawable.emoji_twitter_1f562),
    new Emoji(0x1f563, R.drawable.emoji_twitter_1f563),
    new Emoji(0x1f564, R.drawable.emoji_twitter_1f564),
    new Emoji(0x1f565, R.drawable.emoji_twitter_1f565),
    new Emoji(0x1f566, R.drawable.emoji_twitter_1f566),
    new Emoji(0x1f567, R.drawable.emoji_twitter_1f567)
  };

  @Override @NonNull public Emoji[] getEmojis() {
    return DATA;
  }

  @Override @DrawableRes public int getIcon() {
    return R.drawable.emoji_twitter_category_symbols;
  }
}
