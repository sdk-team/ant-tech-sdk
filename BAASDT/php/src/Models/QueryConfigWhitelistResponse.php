<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Alipaycloud\BAASDT\Models;

use AlibabaCloud\Tea\Model;

use Alipaycloud\BAASDT\Models\APIWhiteListInfo;

class QueryConfigWhitelistResponse extends Model {
    protected $_name = [
        'whiteList' => 'white_list',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->whiteList) {
            $res['white_list'] = [];
            if(null !== $this->whiteList && is_array($this->whiteList)){
                $n = 0;
                foreach($this->whiteList as $item){
                    $res['white_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryConfigWhitelistResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['white_list'])){
            if(!empty($map['white_list'])){
                $model->whiteList = [];
                $n = 0;
                foreach($map['white_list'] as $item) {
                    $model->whiteList[$n++] = null !== $item ? APIWhiteListInfo::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @description 接口白名单信息
     * @example 
     * @var array
     */
    public $whiteList;

}
