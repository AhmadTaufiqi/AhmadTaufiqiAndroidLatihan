package com.kipli.coro;

import java.util.ArrayList;

public class HospitalData {
    private static String[] HospitalNames ={
            "RSUP dr. Kariadi",
            "RSUP dr. Soeradji Tritonegoro Klaten",
            "RS Pari Dr. Ario Wirawan",
            "RSUD Kraton Kabupaten Pekalongan",
            "RSUD Dr. Soeselo Slawi Kabupaten Tegal",
            "RSUD Dr. H. Soewondo Kendal",
            "RSUD Tidar Kota Magelang",
            "RSUD dr.Moewardi",
            "RSUD Banyumas",
            "RSUD Dr. Loekmonohadi Kudus",
            "RSUD Prof. Dr. Margono Soekarjo",
            "RSUD K.R.M.T Wongsonegoro Kota Semarang",
            "RSUD Kardinah"

    };

    private static String[] HospitalDetail ={
            "Rumah Sakit Umum Pusat (RSUP) dr. Kariadi beralamat di Jalan Dr. Soetomo Nomor 16, Semarang. Nomor telepon: (024-8413476) Fax: (024-8318617) Email: info@rskariadi.co.id",
            "Rumah Sakit Umum Pusat (RSUP) dr. Soeradji Tirtonegoro beralamat di Jalan KRT. Dr. Soeradji Tirtonegoro Nomor 1, Klaten, Jawa Tengah. Nomor telepon: (0272-321020) Fax: (0272-321104) Email: rsupsoeradji_klaten@yahoo.compengobatan",
            "RS Paru Dr. Ario Wirawan ini berlokasi di Jalan Hasanudin Nomor 806, Salatiga. Nomor telepon: (0298-326130) Fax: (0298-322703 ) Email: rspariowirawan@gmail.com",
            "Rumah Sakit Umum Daerah (RSUD) ini berlokasi di Jalan Veteran Nomor 31, Pekalongan. Telepon: (0285-423225, 423523) Fax: (0285-423225) Email: rsud_keraton@pekalongankab.go.id atau rsudkraton@yahoo.co.id",
            "RSUD Dr Soeselo Slawi beralamat di Jalan Dr. Sutomo Nomor 63 Slawi, Kabupaten Tegal. Nomor telepon: (0283-491016) Fax: (0283-401016-183) Email: kontak@rsudsoesole.com",
            "RSUD Dr. H. Soewondo ini berlokasi di Jalan Laut Nomor 21, Kendal. Telepon: (0294-381433) Fax: (0294-381573) Email: rsudsoewondokdl@gmail.com atau simrskendal@yahoo.co.id",
            "RSUD Tidar Kota Magelang beralamat di Jalan Tidar Nomor 30 A, Kota Magelang, Jawa Tengah. Nomor telepon: (0293-362260, 362463) Fax: (0293-3868354) Email: rsudtidar@yahoo.co.id",
            "RSUD dr. Moewardi berlokasi di Jalan Kol. Sutarto Nomor 132, Jebres, Surakarta. Telepon: (0271-637415) Fax: (0271-637412) Email: rsmoewardi@jatengprov.go.id",
            "RSUD Banyumas beralamat di Jalan Rumah Sakit Nomor 1, Banyumas. Telepon: (0281-796031) Fax: (0281-796182) Email: rsudbanyumas@banyumaskab.go.id",
            "RSUD Dr. Loekmonohadi Kudus berlokasi di Jalan Dr. Lukmonohadi Nomor 19, Kudus. Telepon: (0291-444001) Fax: (0291-438195) Email: rsuddrloekmonohadi@kuduskab.go.id",
            "RSUD Prof. Dr. Margono Soekarjo beralamat di Jalan Dr. Gumbreg Nomor 1, Purwokerto. Telepon: (0281-632708) Fax: (0281-631015) Email: rsmargono@jatengprov.go.id",
            "RSUD K.R.M.T Wongsonegoro Kota Semarang berlokasi di Jalan Fatmawati Nomor 1, Semarang. Telp: (024) 6711500 Fax: (024) 6717755 Email: rsud@semarangkota.go.id",
            "RSUD Kardinas beralamat di Jalan KS Tubun Nomor 2, Kota Tegal. Telepon: (0283-350377, 350477) Fax: (0283-353131) Email: rsukardinahtegal@gmail.com"
    };
    private static int[] HospitalImages ={
            R.drawable.hospital_image,
            R.drawable.hospital_image,
            R.drawable.hospital_image,
            R.drawable.hospital_image,
            R.drawable.hospital_image,
            R.drawable.hospital_image,
            R.drawable.hospital_image,
            R.drawable.hospital_image,
            R.drawable.hospital_image,
            R.drawable.hospital_image,
            R.drawable.hospital_image,
            R.drawable.hospital_image,
            R.drawable.hospital_image

    };

    static ArrayList<Hospital> getListData(){
        ArrayList<Hospital> list = new ArrayList<>();
        for (int position = 0; position < HospitalNames.length; position++){
            Hospital hospital = new Hospital();
            hospital.setName(HospitalNames[position]);
            hospital.setDetail(HospitalDetail[position]);
            hospital.setPhoto(HospitalImages[position]);
            list.add(hospital);
        }
        return list;
    }
}
