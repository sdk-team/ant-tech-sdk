<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Alipaycloud\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class MultiURL extends Model {
    protected $_name = [
        'normal' => 'normal',
        'style150' => 'style_150',
        'style200' => 'style_200',
        'style70' => 'style_70',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->normal) {
            $res['normal'] = $this->normal;
        }
        if (null !== $this->style150) {
            $res['style_150'] = $this->style150;
        }
        if (null !== $this->style200) {
            $res['style_200'] = $this->style200;
        }
        if (null !== $this->style70) {
            $res['style_70'] = $this->style70;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MultiURL
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['normal'])){
            $model->normal = $map['normal'];
        }
        if(isset($map['style_150'])){
            $model->style150 = $map['style_150'];
        }
        if(isset($map['style_200'])){
            $model->style200 = $map['style_200'];
        }
        if(isset($map['style_70'])){
            $model->style70 = $map['style_70'];
        }
        return $model;
    }
    /**
     * @example https://myexchange.oss-cn-hangzhou.aliyuncs.com/1259371fc8f77d3fa0.jpeg?Expires=1581625032&OSSAccessKeyId=LTAI4FooxCSL7w8Minh2oJqc&Signature=REH79oOsx5MK4%2BEGcFmaSXq6XsM%3D
     * @description 上传的图片正常大小
     * @var string
     */
    public $normal;

    /**
     * @example https://myexchange.oss-cn-hangzhou.aliyuncs.com/1259371fc8f77d3fa0.jpeg?Expires=1581625032&OSSAccessKeyId=LTAI4FooxCSL7w8Minh2oJqc&Signature=A1f%2FtKicryG8VOG%2BpAdSyUNLmCs%3D&x-oss-process=style%2Fscale_image_150
     * @description style150
     * @var string
     */
    public $style150;

    /**
     * @example https://myexchange.oss-cn-hangzhou.aliyuncs.com/1259371fc8f77d3fa0.jpeg?Expires=1581625032&OSSAccessKeyId=LTAI4FooxCSL7w8Minh2oJqc&Signature=LoirSoaWnC5bhIP%2BWZT0OqLlSy4%3D&x-oss-process=style%2Fscale_image_200
     * @description style200
     * @var string
     */
    public $style200;

    /**
     * @example https://myexchange.oss-cn-hangzhou.aliyuncs.com/1259371fc8f77d3fa0.jpeg?Expires=1581625032&OSSAccessKeyId=LTAI4FooxCSL7w8Minh2oJqc&Signature=QxDxjfSFlpjxB7nKdYr%2BISoMPCI%3D&x-oss-process=style%2Fscale_image_70
     * @description style70
     * @var string
     */
    public $style70;

}
