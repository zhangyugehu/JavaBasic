package com.thssh.kotlin.download

import java.io.File
import java.math.BigDecimal


fun main(args: Array<String>) {
//    d(listOf(
//        "https://i0.hdslb.com/bfs/album/c057320a19739ec2d123b09b0bdcc422c83bfe79.jpg",
//        "https://i0.hdslb.com/bfs/album/ea69a8ea690411aba38fe35d4428ca1b1a959405.jpg",
//        "https://a1-img.huxiucdn.com/img/2018.10/1539064136726.jpg",
//        "https://i0.hdslb.com/bfs/album/8d75f68b447eb4e4a82b004bfd6f6a3ee8c4626e.gif",
//        "http://ww1.sinaimg.cn/large/006c69EQly1fwdag3304pj30f20i5na3.jpg",
//        "https://wx1.sinaimg.cn/large/85c624d3gy1fwd9a0tieij20u018fx6q.jpg",
//        "https://wx1.sinaimg.cn/large/85c624d3gy1fwd9awdu5vj20u018fe83.jpg",
//        "https://wx1.sinaimg.cn/large/417b96e8gy1fwadntmor6j23402c0b29.jpg",
//        "https://wx1.sinaimg.cn/large/417b96e8gy1fwadntmor6j23402c0b29.jpg",
//        "https://i0.hdslb.com/bfs/album/191dbafd705a67bad228dd76b8e1ba017331793a.jpg",
//        "https://i0.hdslb.com/bfs/album/191dbafd705a67bad228dd76b8e1ba017331793a.jpg",
//        "https://i0.hdslb.com/bfs/album/a57dd926d05979cfce0987deda81d66f6d047414.jpg",
//        "https://i0.hdslb.com/bfs/album/9ba5dc407cb63f1330f191350b42537165c219b4.jpg",
//        "https://i0.hdslb.com/bfs/album/a3b6a4f9ede34c41cc72f44b77e569244bbb7d33.jpg",
//        "https://i0.hdslb.com/bfs/album/2a745198a773ccc9394b95f29344527a64ca73ec.jpg",
//        "https://i0.hdslb.com/bfs/album/8ee24327d91884d289ad31224416cc8df6ae5486.jpg",
//        "https://i0.hdslb.com/bfs/album/95473f0e816ad032353cc8bb6211cf970eefc4f6.jpg",
//        "https://lc-file-prod.visvachina.com/ZF7f0DEMbnUQNLZkS0geOxB.png",
//        "http://v3-dy-x.ixigua.com/2c42ab1aa87d27fe0bef362760a072b4/5bc9a67c/video/m/2201bf5021baf574c6983f417d7783784fc115c79a400009c991856afd5/",
//        "https://camo.githubusercontent.com/8e463ae5f7369642eb7d8495a7e04e34594e5acc/687474703a2f2f7777312e73696e61696d672e636e2f6c617267652f6237356238373736677931667673687a32626834716a3230726e3065687766342e6a7067"
//    ), "picture")

//    d(listOf(
//        "http://v3-dy-x.ixigua.com/2903594e012787157c482626cf629e96/5bc9b095/video/m/220da7f75df395a45a989683dcf07b6133b115cdbb900008801024eb82f/",
//        "http://v3-dy-x.ixigua.com/5cbd7b27ce99b2fa831418bb0e59daec/5bc9b095/video/m/220ace8aa0050f14151b6aaa5451498bae0115cab340000a0a16c432522/",
//        "http://v3-dy-x.ixigua.com/a7e200fb079c0a00f1305185b540f692/5bc9b095/video/m/220992a89b8cc894564990386a05b4e8d18115d878300009827f9664f8c/",
//        "http://v3-dy-x.ixigua.com/a7e200fb079c0a00f1305185b540f692/5bc9b095/video/m/220992a89b8cc894564990386a05b4e8d18115d878300009827f9664f8c/",
//        "http://v3-dy-x.ixigua.com/7b9d62a8c67c61fbbdc9f335ad096cff/5bc9b097/video/m/22072b4253f3d274ce18ef954eedd570e7d115d8e700000917f588e6e46/",
//        "http://v3-dy-x.ixigua.com/7b9d62a8c67c61fbbdc9f335ad096cff/5bc9b097/video/m/22072b4253f3d274ce18ef954eedd570e7d115d8e700000917f588e6e46/",
//        "http://v3-dy-x.ixigua.com/135a14e8d8f972304c474b632495e756/5bc9b096/video/m/22036791e2b2deb4be6b6aaeedaef692f12115d85c00000868abf2aa422/",
//        "http://v3-dy-x.ixigua.com/eaf4ec813c4143d433690602e9c0c933/5bc9b0bf/video/m/220c48b2a95aa9b46dabbb07c90adfa3f66115c80c50000b7faf8d2510d/",
//        "http://v3-dy-x.ixigua.com/eaf4ec813c4143d433690602e9c0c933/5bc9b0bf/video/m/220c48b2a95aa9b46dabbb07c90adfa3f66115c80c50000b7faf8d2510d/",
//        "http://v3-dy-x.ixigua.com/d57d423f92812357ab9b13565bc00a76/5bc9b096/video/m/22083bb37b3109b42bf9b236f55349da558115c681600008436be8deb2b/",
//        "http://v3-dy-x.ixigua.com/d57d423f92812357ab9b13565bc00a76/5bc9b096/video/m/22083bb37b3109b42bf9b236f55349da558115c681600008436be8deb2b/",
//        "http://v3-dy-x.ixigua.com/b0700ad29bc78af75a940ce45df1ca64/5bc9b09a/video/m/2206de3d3d14c674c59b62c84eea9313e8f115bf0590000030cc71f43b6/",
//        "http://v3-dy-x.ixigua.com/b0700ad29bc78af75a940ce45df1ca64/5bc9b09a/video/m/2206de3d3d14c674c59b62c84eea9313e8f115bf0590000030cc71f43b6/",
//        "http://v3-dy-x.ixigua.com/76004c450c818b5576fa7ff2b517bf28/5bc9b096/video/m/2205a1809dab216406cb9bdfd7c060f9ef3115d1e8a00006aee09fde134/",
//        "http://v3-dy-x.ixigua.com/76004c450c818b5576fa7ff2b517bf28/5bc9b096/video/m/2205a1809dab216406cb9bdfd7c060f9ef3115d1e8a00006aee09fde134/",
//        "http://v3-dy-x.ixigua.com/d8dc0be01e5fc3518882701cb23f7b8a/5bc9b0a3/video/m/220181ad556bbcf4da68def9903ff3843a3115d274100005905cfea0733/",
//        "http://v3-dy-x.ixigua.com/d8dc0be01e5fc3518882701cb23f7b8a/5bc9b0a3/video/m/220181ad556bbcf4da68def9903ff3843a3115d274100005905cfea0733/",
//        "http://v3-dy-x.ixigua.com/f440ca1b924c98632c1e24664aac3331/5bc9b095/video/m/22084d6d374edbe483c8bcf8a247d5e8a9f115ca7890000bb302a6b6b8f/",
//        "http://v3-dy-x.ixigua.com/f440ca1b924c98632c1e24664aac3331/5bc9b095/video/m/22084d6d374edbe483c8bcf8a247d5e8a9f115ca7890000bb302a6b6b8f/",
//        "http://v3-dy-x.ixigua.com/fd96fcab0d26d062842330d39db09b8c/5bc9b097/video/m/2205b42876e53c54f90bb798300a5fe87ef115c9a4300009557ff10b977/",
//        "http://v3-dy-x.ixigua.com/2a91793144d4c7446bbd99fdf884d275/5bc9b09a/video/m/2209d56164a812242fd87f1829439568de8115bbe9200006dde37e3c376/",
//        "http://v3-dy-x.ixigua.com/83fc8ef59fbfac9d4918f780bc837e6f/5bc9b095/video/m/220f76a948e11e04b809a91a0a2e1ad40ca115caf0f00007f6613f7e07e/",
//        "http://v3-dy-x.ixigua.com/2a91793144d4c7446bbd99fdf884d275/5bc9b09a/video/m/2209d56164a812242fd87f1829439568de8115bbe9200006dde37e3c376/",
//        "http://v3-dy-x.ixigua.com/a0b9f05bbbf3ef2d9f1257b2a0043ce7/5bc9b097/video/m/220b07023083b1d4cde948120ed12e248e9115d97ea00007c4bb3e1d749/",
//        "http://v3-dy-x.ixigua.com/a0b9f05bbbf3ef2d9f1257b2a0043ce7/5bc9b097/video/m/220b07023083b1d4cde948120ed12e248e9115d97ea00007c4bb3e1d749/"
//    ), "video")

//    d(listOf(
//            "http://p1.pstatp.com/obj/c853000ff659f147682f",
//            "http://p1.pstatp.com/obj/c83300148d959f8a60b1",
//            "http://p9.pstatp.com/obj/c8580007195863f40ff7",
//            "http://p3.pstatp.com/obj/c84100187bb3e1e459ca",
//            "http://p3.pstatp.com/obj/c84d0007ec696c1ff6e8",
//            "http://p3.pstatp.com/obj/c818001b7d4f790dc0c2",
//            "http://p3.pstatp.com/obj/c84d0007ec696c1ff6e8"
//    ), "douyi/bg")

    d(listOf(
            "http://v3-dy.ixigua.com/a0a69f13a84eebcb8d5fc5b791a9c7dd/5bc9b83f/video/m/220ad11e742b3e143708b96e5e15a1502f61154b04500002ac2cafa0ec0/",
            "http://v3-dy.ixigua.com/26e685cb9e05c81e7943f9b012df8107/5bc9b83a/video/m/220db4c8bfe93d9443085711b4ca779572311543f030000db3b2db4f85b/",
            "http://v3-dy.ixigua.com/26e685cb9e05c81e7943f9b012df8107/5bc9b83a/video/m/220db4c8bfe93d9443085711b4ca779572311543f030000db3b2db4f85b/",
            "http://v3-dy.ixigua.com/08fa4fb991b9f4469549fd96dc24b842/5bc9b83f/video/m/2207582a06ccc794de78fe2b5daa687195b115512b60000c690b7b76147/",
            "http://v3-dy.ixigua.com/d45640d14ff61fafd35b578277191536/5bc9b83f/video/m/220383a2d2864874822afa466a84c0880f911550ce500007f11d242c4c5/",
            "http://v6-dy.ixigua.com/video/m/220278f69d6d3bd44e7ba2e5448e3e536af1154bba80000b672a6bcec2e/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946252&Signature=n4PqW6wo7uAy3d2MNf%2B%2BDO9zmbE%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/2209938b3a03e024c39bf65570413084e72115508b20000fc5ad9d6f72d/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946250&Signature=gesy6i%2BW1VWbpf3lO2uZF8B7aPg%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/220262f89ad45274d41bc06d5915b91bf041155137c000009219f429666/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946248&Signature=yHH%2BTdncQe1MsXeFynqCCA0onrE%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/220262f89ad45274d41bc06d5915b91bf041155137c000009219f429666/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946248&Signature=yHH%2BTdncQe1MsXeFynqCCA0onrE%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/2205544b7ee08fb4f01997f9194fbfd994c115566c3000091a04043d10c/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946250&Signature=b8VFFStXG%2F4MbKf6OOB7cPGxvSc%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/2205544b7ee08fb4f01997f9194fbfd994c115566c3000091a04043d10c/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946250&Signature=b8VFFStXG%2F4MbKf6OOB7cPGxvSc%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/220c31c700d97554eb6b7d5b89d8c74310c1155e54900000c597f14e85c/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946252&Signature=seTLBjU66m1A9PCfHBD3f3fzYuw%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/220c31c700d97554eb6b7d5b89d8c74310c1155e54900000c597f14e85c/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946252&Signature=seTLBjU66m1A9PCfHBD3f3fzYuw%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/220e386dfd155c0464bb277d0cfa1d19ed011571046000095dbcd44c8f7/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946252&Signature=k6z%2FWmuHlOr2Z%2FaaxfgqQSi2qhY%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/220f9d97e12b1504b1682917dfd287dd60f115848570000dfd0506cd9d9/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946244&Signature=L%2F7UUIMEikfE0WJVbE4dLm2pK0E%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/2207d0a35ec172e4929a79121181f0371a71158c95c0000142d11169abf/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946252&Signature=QxfbpHvollqVf%2Fh3HyF%2FNk2VlUg%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/2207d0a35ec172e4929a79121181f0371a71158c95c0000142d11169abf/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946252&Signature=QxfbpHvollqVf%2Fh3HyF%2FNk2VlUg%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/22026dcd8836b844796b91addb77ce92193115959d2000095424b92dae4/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946249&Signature=46WcR6kV1%2FiVjAnwLAQZWeNCbR8%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/2205e2feecaa6ea490aa7d72bdaca441287115953cf0000c169073e7468/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946247&Signature=znkYw646HM1KfLcI7oaIykv%2BlXk%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v6-dy.ixigua.com/video/m/220b3e4883dfa3d47ccbd8beda07056cfa7115ab6d6000071a5d473c897/?AWSAccessKeyId=qh0h9TdcEMoS2oPj7aKX&Expires=1539946252&Signature=C2UQu3xuk%2Bf%2BogAqygt6fqgLUEk%3D&ac=WIFI&iid=46519131041&device_id=36889503807&os_api=18&app_name=aweme&channel=App%20Store&idfa=0F2848D2-D88A-4DB2-B5FF-54AFFBC722ED&device_platform=iphone&build_number=29101&vid=51F1C06D-CF21-4E11-B5D8-DC8DE5EC60B0&openudid=9043a0c532bcc2aa447722ea370e332d54a034fd&device_type=iPhone9%2C1&app_version=2.9.1&version_code=2.9.1&os_version=12.0.1&screen_width=750&aid=1128&pass-region=1",
            "http://v3-dy.ixigua.com/967554da865e1fb6f0cd6fa85a3e1ce7/5bc9b70c/video/m/2200e5703c9369c42b6a4807e7611534ab4115ad3b80000474218177eda/",
            "http://v3-dy.ixigua.com/9dda7d7fafb5185a57752aab9124425b/5bc9b705/video/m/22089d6d8d62b384618b1a895b97fabe29b115af43400001196379f64b5/",
            "http://v3-dy.ixigua.com/9dda7d7fafb5185a57752aab9124425b/5bc9b705/video/m/22089d6d8d62b384618b1a895b97fabe29b115af43400001196379f64b5/",
            "http://v3-dy.ixigua.com/3296f831a3229fd83f59114101c3b9fd/5bc9b70c/video/m/220fe5f28041a1249e984567d9e5b28c0bf115b27ed00003356da85f790/",
            "http://v3-dy.ixigua.com/425b25159da34a95d384bb7260fc59cc/5bc9b705/video/m/220fb79a686b1324de293c1d7cc4060966e115b193300002365901f2085/",
            "http://v3-dy.ixigua.com/2da5ad396e0641cbce6e1d8a467ebba3/5bc9b70b/video/m/2206ccf800b69dc4e448f9baffd559e4b95115b1a110000a63101fc1f45/",
            "http://v3-dy.ixigua.com/2da5ad396e0641cbce6e1d8a467ebba3/5bc9b70b/video/m/2206ccf800b69dc4e448f9baffd559e4b95115b1a110000a63101fc1f45/",
            "http://v3-dy.ixigua.com/60ca2d8f2e6fa177e5e5a8201f9f8303/5bc9b708/video/m/220777697567b30414d8a73a433f3d1a4a6115b9cb40000b4a1832b27bd/",
            "http://v3-dy.ixigua.com/80f1570a777c2427e428d6af0f929609/5bc9b708/video/m/220eb80f2207dda4f56a07fe806377a2524115b9d8f0000b63f7c1241b6/",
            "http://v3-dy.ixigua.com/80f1570a777c2427e428d6af0f929609/5bc9b708/video/m/220eb80f2207dda4f56a07fe806377a2524115b9d8f0000b63f7c1241b6/",
            "http://v3-dy.ixigua.com/b6f5186c0493b73106f5d0469566f819/5bc9b706/video/m/2204c834ca78ee444cfaa7a699c81109218115be2540000d91e8933d5c6/",
            "http://v3-dy.ixigua.com/b6f5186c0493b73106f5d0469566f819/5bc9b706/video/m/2204c834ca78ee444cfaa7a699c81109218115be2540000d91e8933d5c6/",
            "http://v3-dy.ixigua.com/ec8cd05b1da59e26e18b27619ef5c7a0/5bc9b70a/video/m/2201b9c1aa9e651429087653d9ba7acce2e115be9cf00004d736d5b6ea1/",
            "http://v3-dy.ixigua.com/7d41285d771fd64968d1574771116a55/5bc9b70b/video/m/22015c8ab78611e48f4ba77435f66868b16115d7961000018c2ac95c075/",
            "http://v3-dy.ixigua.com/7d41285d771fd64968d1574771116a55/5bc9b70b/video/m/22015c8ab78611e48f4ba77435f66868b16115d7961000018c2ac95c075/",
            "http://v3-dy.ixigua.com/aad47181d193c4763249eea3b0c9b507/5bc9b70c/video/m/220739d088050a64d8582711174fe52fe88115c495c0000b941130de5ab/",
            "http://v3-dy.ixigua.com/aad47181d193c4763249eea3b0c9b507/5bc9b70c/video/m/220739d088050a64d8582711174fe52fe88115c495c0000b941130de5ab/",
            "http://v3-dy.ixigua.com/aac3c05c28c807b9211862fb1b94533b/5bc9b70c/video/m/220cbc52c0720d84de58f457f4c7e3914e8115d9266000069b5bf1c4c8c/",
            "http://v3-dy.ixigua.com/934655b287dc3c9f3b2fb4bff584dfaf/5bc9b708/video/m/2203d2662c14e3b4aeebd02a13670106f1f115cd81600004de97efe5486/",
            "http://v3-dy.ixigua.com/83ac2f01b13a6dcf97b4fa237fff3a78/5bc9b70c/video/m/220d75c7e3480b44ab1bfc28dc8db3845c5115d2d2000003917a290ddff/",
            "http://v3-dy.ixigua.com/83ac2f01b13a6dcf97b4fa237fff3a78/5bc9b70c/video/m/220d75c7e3480b44ab1bfc28dc8db3845c5115d2d2000003917a290ddff/",
            "http://v3-dy.ixigua.com/745d4d3aa285ccb520994a960ad9655c/5bc9b70c/video/m/22056ead095a69f4c38a29ffb00a11600e8115c9455000083dad18c4bd3/",
            "http://v3-dy.ixigua.com/745d4d3aa285ccb520994a960ad9655c/5bc9b70c/video/m/22056ead095a69f4c38a29ffb00a11600e8115c9455000083dad18c4bd3/",
            "http://v3-dy.ixigua.com/2af08e9473cb9dd2bd3b1d6967506587/5bc9b707/video/m/220fe6c2c08801945d495ae8638e8fcee0a115cd20e000045e2a9f7726b/",
            "http://v3-dy.ixigua.com/2af08e9473cb9dd2bd3b1d6967506587/5bc9b707/video/m/220fe6c2c08801945d495ae8638e8fcee0a115cd20e000045e2a9f7726b/",
            "http://v3-dy.ixigua.com/199933620d92108372a9fadde13d9c39/5bc9b703/video/m/22026859430e8fb4a389a6b97830d261ddb115d37d300006c0c89bff244/"
    ), "douyin/ss")
}

fun d(list: List<String>, folder: String){
    Downloader().downList(
        list,
        "",
        object : Downloader.CallBack {
            override fun onReady(url: String) {
                log(url, "start")
            }

            override fun onSuccess(url: String, file: File) {
                log(url, "success. File size: ${formatSize(file.length())}")
            }

            override fun onFailure(url: String, error: String) {
                log(url, error)
            }

        }, "D:/download/$folder/")
}

fun formatSize(size: Long):String{
    var formatSize:Double = size.toDouble()
    var sizeLevel = "B"
    if(formatSize > 1024) {
        formatSize /= 1024
        sizeLevel = "KB"
    }
    if(formatSize > 1024){
        formatSize /= 1024
        sizeLevel = "MB"
    }
    if(formatSize > 1024){
        formatSize /= 1024
        sizeLevel = "GB"
    }
    if(formatSize > 1024){
        formatSize /= 1024
        sizeLevel = "TB"
    }
    if(formatSize > 1024){
        formatSize /= 1024
        sizeLevel = "PB"
    }

    formatSize = BigDecimal.valueOf(formatSize).setScale(2, BigDecimal.ROUND_HALF_UP).toDouble()
    return "$formatSize $sizeLevel"
}

fun log(tag:String, text:String){
    println("Thread[${Thread.currentThread().name}] $tag -- $text")
}