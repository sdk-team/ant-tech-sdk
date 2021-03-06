<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Alipaycloud\EBC\Models;

use AlibabaCloud\Tea\Model;

class ResumePersonRequest extends Model {
    protected $_name = [
        'personDid' => 'person_did',
    ];
    public function validate() {
        Model::validateMaxLength('personDid', $this->personDid, 128);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->personDid) {
            $res['person_did'] = $this->personDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResumePersonRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['person_did'])){
            $model->personDid = $map['person_did'];
        }
        return $model;
    }
    /**
     * @description 个人did
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $personDid;

}
